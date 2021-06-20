package com.gantz.service.api.scryfallapi.service;

import org.springframework.http.ResponseEntity;

public interface ScryFallApiService {

    <T> ResponseEntity<T> get(String uri, Class<T> responseClass);

    <T> ResponseEntity<T> get(String uri, Class<T> responseClass, Object... variables);

}
