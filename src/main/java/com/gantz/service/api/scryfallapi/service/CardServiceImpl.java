package com.gantz.service.api.scryfallapi.service;

import com.gantz.service.api.scryfallapi.domain.Card;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@Log4j2
public class CardServiceImpl {

    private final ScryFallApiService scryFallApiService;

    public CardServiceImpl(ScryFallApiService scryFallApiService) {
        this.scryFallApiService = scryFallApiService;
    }

    // TODO implement QueryBuilderFactory for specific queries
    // without everything but Query
    public CardListResponse search(String query) {
        return scryFallApiService.get(ScryFallConstants.CardApi.SEARCH, CardListResponse.class, query);
    }

    // without exact, set, format, face, version
    public Card getByNamed(String fuzzyQuery) {
        return scryFallApiService.get(ScryFallConstants.CardApi.NAMED, Card.class, fuzzyQuery);
    }

    // without include_extras
    public Card getByAutocomplete(String query) {
        return scryFallApiService.get(ScryFallConstants.CardApi.AUTOCOMPLETE, Card.class, query);
    }

    // without face, format, version, QUERY
    public Card getByRandom() {
        return scryFallApiService.get(ScryFallConstants.CardApi.RANDOM, Card.class);
    }

    // size 75 maximum
    public CardCollectionResponse getByIdentifiers(List<Map<String, Object>> identifiers) {
        return scryFallApiService.post(ScryFallConstants.CardApi.COLLECTION, new CardIdentifiersRequest(identifiers), CardCollectionResponse.class);
    }

    // without face, format, version
    public Card getByCodeNumber(String code, Object number, String lang) {
        return scryFallApiService.get(ScryFallConstants.CardApi.BY_CODE_NUMBER, Card.class, code, number, lang);
    }

    // without face, format, version
    public Card getByMultiverseId(Integer id) {
        return scryFallApiService.get(ScryFallConstants.CardApi.BY_MULTIVERSE_ID, Card.class);
    }

    // without face, format, version
    public Card getByMtgoId(Integer id) {
        return scryFallApiService.get(ScryFallConstants.CardApi.BY_MTGO_ID, Card.class);
    }

    // without face, format, version
    public Card getByArenaId(Integer id) {
        return scryFallApiService.get(ScryFallConstants.CardApi.BY_ARENA_ID, Card.class);
    }

    // without face, format, version
    public Card getByTcgplayerId(Integer id) {
        return scryFallApiService.get(ScryFallConstants.CardApi.BY_TCGPLAYER_ID, Card.class);
    }

    // without face, format, version
    public Card getByCardmarketId(Integer id) {
        return scryFallApiService.get(ScryFallConstants.CardApi.BY_CARDMARKET_ID, Card.class);
    }

    // without face, format, version
    public Card getById(String id) {
        return scryFallApiService.get(ScryFallConstants.CardApi.BY_ID, Card.class);
    }

}
