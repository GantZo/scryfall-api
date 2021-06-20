package com.gantz.service.api.scryfallapi.service;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Primary;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

public class ScryFallApiServiceImpl implements ScryFallApiService {

    private final RestTemplate restTemplate;

    public ScryFallApiServiceImpl(RestTemplateBuilder restTemplateBuilder, ScryFallApiErrorHandler handler) {
        this.restTemplate = restTemplateBuilder.errorHandler(handler)
                .build();
    }

    @Override
    public <T> T get(String uri, Class<T> responseClass) {
        return restTemplate.getForEntity(ScryFallConstants.API_URI + uri, responseClass).getBody();
    }

    @Override
    public <T> T get(String uri, Class<T> responseClass, Object... variables) {
        HttpHeaders headers = new HttpHeaders();
        headers.set(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);
        HttpEntity entity = new HttpEntity(headers);

        return restTemplate.exchange(ScryFallConstants.API_URI + uri, HttpMethod.GET, entity, responseClass, variables).getBody();
    }

}
