package com.gantz.service.api.scryfallapi.service;

import com.gantz.service.api.scryfallapi.domain.Card;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class CardServiceImpl {

    private final ScryFallApiService scryFallApiService;

    public CardServiceImpl(ScryFallApiService scryFallApiService) {
        this.scryFallApiService = scryFallApiService;
    }

//    public Card getById(String id) {
//        return scryFallApiService.get()
//    }

}
