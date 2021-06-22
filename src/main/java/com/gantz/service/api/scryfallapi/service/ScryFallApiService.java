package com.gantz.service.api.scryfallapi.service;

import org.springframework.http.ResponseEntity;

public interface ScryFallApiService {

    <T> T get(String uri, Class<T> responseClass);

    <T> T get(String uri, Class<T> responseClass, Object... variables);

    <T, V> T post(String uri, V body, Class<T> responseClass);

}
