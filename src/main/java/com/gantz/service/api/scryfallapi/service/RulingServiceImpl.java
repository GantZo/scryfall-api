package com.gantz.service.api.scryfallapi.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import static com.gantz.service.api.scryfallapi.service.ScryFallConstants.RulingApi.*;

@Service
@Log4j2
public class RulingServiceImpl {

    private final ScryFallApiService scryFallApiService;

    public RulingServiceImpl(ScryFallApiService scryFallApiService) {
        this.scryFallApiService = scryFallApiService;
    }

    public RulingResponse getByMultiverseId(Integer id) {
        return scryFallApiService.get(BY_MUILTIVERSE_ID, RulingResponse.class, id).getBody();
    }

    public RulingResponse getByMtgoId(Integer id) {
        return scryFallApiService.get(BY_MTGO_ID, RulingResponse.class, id).getBody();
    }

    public RulingResponse getByArenaId(Integer id) {
        return scryFallApiService.get(BY_ARENA_ID, RulingResponse.class, id).getBody();
    }

    public RulingResponse getByCodeNumber(String code, Object number) {
        return scryFallApiService.get(BY_CODE_NUMBER, RulingResponse.class, code, number).getBody();
    }

    public RulingResponse getById(String id) {
        return scryFallApiService.get(BY_ID, RulingResponse.class, id).getBody();
    }

}
