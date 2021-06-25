package com.gantz.service.api.scryfallapi.service;

import java.util.HashMap;
import java.util.Map;

public enum QueryParameter {

    ID("id"),
    FORMAT("format"),
    PRETTY("pretty"),
    FACE("face"),
    VERSION("version");

    private final static Map<String, QueryParameter> BY_CODE = new HashMap<>();

    static {
        for (QueryParameter v : values()) {
            BY_CODE.put(v.code, v);
        }
    }

    private final String code;

    QueryParameter(String code) {
        this.code = code;
    }

    public static QueryParameter valueByCode(String code) {
        return BY_CODE.get(code);
    }

    public String getCode() {
        return code;
    }

}
