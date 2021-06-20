package com.gantz.service.api.scryfallapi.service;

import com.gantz.service.api.scryfallapi.domain.ManaCost;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import static com.gantz.service.api.scryfallapi.service.ScryFallConstants.CardSymbolApi.*;

@Service
@Log4j2
public class CardSymbolServiceImpl {

    private final ScryFallApiService apiService;

    public CardSymbolServiceImpl(ScryFallApiService apiService) {
        this.apiService = apiService;
    }

    public CardSymbolResponse getAll() {
        return apiService.get(SYMBOLS, CardSymbolResponse.class).getBody();
    }

    public ManaCost parseCost(String cost) {
        return apiService.get(PARSE_MANA, ManaCost.class, cost).getBody();
    }

}
