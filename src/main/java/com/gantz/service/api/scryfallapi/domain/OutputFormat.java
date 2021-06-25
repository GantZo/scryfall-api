package com.gantz.service.api.scryfallapi.domain;

public enum OutputFormat {

    JSON,
    TEXT,
    IMAGE;

    public static OutputFormat getDefault() {
        return JSON;
    }

}
