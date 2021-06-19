package com.gantz.service.api.scryfallapi.service;

public enum RulingApi {

    BY_MUILTIVERSE_ID("/cards/multiverse/{id}/rulings"),
    BY_MTGO_ID("/cards/mtgo/{id}/rulings"),
    BY_ARENA_ID("/cards/arena/{id}/rulings"),
    BY_CODE_NUMBER("/cards/{code}/{number}/rulings"),
    BY_ID("/cards/{id}/rulings");

    private String url;

    RulingApi(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

}
