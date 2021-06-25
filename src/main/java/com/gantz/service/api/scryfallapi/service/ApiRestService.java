package com.gantz.service.api.scryfallapi.service;

import java.io.IOException;

public interface ApiRestService {

    <T> T get(String uri, Class<T> responseClass) throws IOException;

    <T, V> T post(String uri, V body, Class<T> responseClass) throws IOException;

}
