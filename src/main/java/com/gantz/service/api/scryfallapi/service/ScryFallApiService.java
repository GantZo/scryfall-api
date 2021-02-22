package com.gantz.service.api.scryfallapi.service;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ScryFallApiService {

    private final RestTemplate restTemplate;

    public ScryFallApiService(RestTemplateBuilder restTemplateBuilder, ScryFallApiErrorHandler handler) {
        this.restTemplate = restTemplateBuilder.errorHandler(handler)
                .build();
    }

    public <T> ResponseEntity<T> get(String uri, Class<T> responseClass) {
        return restTemplate.getForEntity(ScrFallConstants.API_URI +  uri, responseClass);
    }

}