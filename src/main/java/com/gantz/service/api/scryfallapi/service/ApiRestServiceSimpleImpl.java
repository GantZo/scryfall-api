package com.gantz.service.api.scryfallapi.service;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class ApiRestServiceSimpleImpl implements ApiRestService {

    private final ObjectMapper objectMapper;

    public ApiRestServiceSimpleImpl(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Override
    public <T> T get(String uri, Class<T> responseClass) throws IOException {
        HttpURLConnection con = (HttpURLConnection) new URL(uri).openConnection();
        con.setRequestMethod("GET");
        con.setInstanceFollowRedirects(true);
        con.setRequestProperty("Accept", "application/json");
        return readOutput(con, responseClass);
    }

    @Override
    public <T, V> T post(String uri, V body, Class<T> responseClass) throws IOException {
        HttpURLConnection con = (HttpURLConnection) new URL(uri).openConnection();
        con.setRequestMethod("POST");
        con.setInstanceFollowRedirects(true);
        con.setRequestProperty("Content-Type", "application/json; utf-8");
        con.setRequestProperty("Accept", "application/json");
        con.setDoOutput(true);
        String jsonString = objectMapper.writeValueAsString(body);
        try (OutputStream os = con.getOutputStream()) {
            byte[] input = jsonString.getBytes(StandardCharsets.UTF_8);
            os.write(input);
        }
        return readOutput(con, responseClass);
    }

    private <T> T readOutput(HttpURLConnection con, Class<T> responseClass) throws IOException {
        boolean is2xx = is2xx(con.getResponseCode());
        try (BufferedReader br = new BufferedReader(new InputStreamReader(is2xx ? con.getInputStream() : con.getErrorStream(), StandardCharsets.UTF_8))) {
            StringBuilder sb = new StringBuilder();
            String responseLine;
            while ((responseLine = br.readLine()) != null) {
                sb.append(responseLine.trim());
            }
            return objectMapper.readValue(sb.toString(), responseClass);
        }
    }

    private boolean is2xx(int code) {
        return code / 200 == 1;
    }

}
