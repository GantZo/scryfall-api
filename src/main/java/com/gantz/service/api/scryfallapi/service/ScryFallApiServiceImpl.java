package com.gantz.service.api.scryfallapi.service;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
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

//        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url)
//                .queryParam("msisdn", msisdn)
//                .queryParam("email", email)
//                .queryParam("clientVersion", clientVersion)
//                .queryParam("clientType", clientType)
//                .queryParam("issuerName", issuerName)
//                .queryParam("applicationName", applicationName);
//        builder.toUriString()

        return restTemplate.exchange(ScryFallConstants.API_URI + uri, HttpMethod.GET, entity, responseClass, variables).getBody();
    }

    @Override
    public <T, V> T post(String uri, V body, Class<T> responseClass) {
        return restTemplate.postForEntity(uri, body, responseClass).getBody();
    }

}
