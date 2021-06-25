package com.gantz.service.api.scryfallapi.domain;

import java.util.HashMap;
import java.util.Map;

public enum ImageVersion {

    SMALL("small"),
    NORMAL("normal"),
    LARGE("large"),
    PNG("png"),
    ART_CROP("art_crop"),
    BORDER_CROP("border_crop");

    private String type;

    private final static Map<String, ImageVersion> BY_TYPE = new HashMap<>();

    static {
        for (ImageVersion v : values()) {
            BY_TYPE.put(v.type, v);
        }
    }

    ImageVersion(String type) {
        this.type = type;
    }

    public static ImageVersion getDefault() {
        return LARGE;
    }

    public static ImageVersion valueByType(String type) {
        return BY_TYPE.get(type);
    }

    public String getType() {
        return this.type;
    }

}
