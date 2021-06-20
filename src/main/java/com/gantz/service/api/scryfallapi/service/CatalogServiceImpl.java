package com.gantz.service.api.scryfallapi.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import static com.gantz.service.api.scryfallapi.service.ScryFallConstants.CatalogApi.*;

@Service
@Log4j2
public class CatalogServiceImpl {

    private final ScryFallApiService apiService;

    public CatalogServiceImpl(ScryFallApiService apiService) {
        this.apiService = apiService;
    }


    public CatalogResponse getCardNames() {
        return apiService.get(CARD_NAMES, CatalogResponse.class);
    }

    public CatalogResponse getArtistNames() {
        return apiService.get(ARTIST_NAMES, CatalogResponse.class);
    }

    public CatalogResponse getWordBank() {
        return apiService.get(WORD_BANK, CatalogResponse.class);
    }

    public CatalogResponse getCreatureTypes() {
        return apiService.get(CREATURE_TYPES, CatalogResponse.class);
    }

    public CatalogResponse getPlaneswalkerTypes() {
        return apiService.get(PLANESWALKER_TYPES, CatalogResponse.class);
    }

    public CatalogResponse getLandTypes() {
        return apiService.get(LAND_TYPES, CatalogResponse.class);
    }

    public CatalogResponse getArtifactTypes() {
        return apiService.get(ARTIFACT_TYPES, CatalogResponse.class);
    }

    public CatalogResponse getEnchantmentTypes() {
        return apiService.get(ENCHANTMENT_TYPES, CatalogResponse.class);
    }

    public CatalogResponse getSpellTypes() {
        return apiService.get(SPELL_TYPES, CatalogResponse.class);
    }

    public CatalogResponse getPowers() {
        return apiService.get(POWERS, CatalogResponse.class);
    }

    public CatalogResponse getToughnesses() {
        return apiService.get(TOUGHNESSES, CatalogResponse.class);
    }

    public CatalogResponse getLoyalties() {
        return apiService.get(LOYALTIES, CatalogResponse.class);
    }

    public CatalogResponse getWaterMarks() {
        return apiService.get(WATERMARKS, CatalogResponse.class);
    }

    public CatalogResponse getKeywordAbilities() {
        return apiService.get(KEYWORD_ABILITIES, CatalogResponse.class);
    }

    public CatalogResponse getKeywordActions() {
        return apiService.get(KEYWORD_ACTIONS, CatalogResponse.class);
    }

    public CatalogResponse getAbilityWords() {
        return apiService.get(ABILITY_WORDS, CatalogResponse.class);
    }

}