package com.gantz.service.api.scryfallapi.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.ResponseErrorHandler;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@Component
public class ScryFallApiErrorHandler implements ResponseErrorHandler {

    @Override
    public boolean hasError(ClientHttpResponse response) throws IOException {
        return response.getStatusCode().is4xxClientError() || response.getStatusCode().is5xxServerError();
    }

    @Override
    public void handleError(ClientHttpResponse response) throws IOException {
        if (response.getStatusCode().is5xxServerError()) {
            System.out.println("server error");
        } else if (response.getStatusCode().is4xxClientError()) {
            ScryFallError scryFallError = new ObjectMapper().readValue(response.getBody(), ScryFallError.class);
            System.out.println("client error");
            if (response.getStatusCode() == HttpStatus.NOT_FOUND) {
                System.out.println("client not found error");
            } else {
                throw new HttpClientErrorException(response.getStatusCode(), response.getStatusText(), response.getHeaders(), new ObjectMapper().writeValueAsBytes(scryFallError), StandardCharsets.UTF_8);
            }
        }
    }

}