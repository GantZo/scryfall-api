package com.gantz.service.api.scryfallapi.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import static com.gantz.service.api.scryfallapi.service.ScrFallConstants.CatalogApi.*;

@Service
@Log4j2
public class CatalogServiceImpl {

    private final ScryFallApiService apiService;

    public CatalogServiceImpl(ScryFallApiService apiService) {
        this.apiService = apiService;
    }


    public CatalogResponse getCardNames() {
        return apiService.get(CARD_NAMES, CatalogResponse.class).getBody();
    }

    public CatalogResponse getArtistNames() {
        return apiService.get(ARTIST_NAMES, CatalogResponse.class).getBody();
    }

    public CatalogResponse getWordBank() {
        return apiService.get(WORD_BANK, CatalogResponse.class).getBody();
    }

    public CatalogResponse getCreatureTypes() {
        return apiService.get(CREATURE_TYPES, CatalogResponse.class).getBody();
    }

    public CatalogResponse getPlaneswalkerTypes() {
        return apiService.get(PLANESWALKER_TYPES, CatalogResponse.class).getBody();
    }

    public CatalogResponse getLandTypes() {
        return apiService.get(LAND_TYPES, CatalogResponse.class).getBody();
    }

    public CatalogResponse getArtifactTypes() {
        return apiService.get(ARTIFACT_TYPES, CatalogResponse.class).getBody();
    }

    public CatalogResponse getEnchantmentTypes() {
        return apiService.get(ENCHANTMENT_TYPES, CatalogResponse.class).getBody();
    }

    public CatalogResponse getSpellTypes() {
        return apiService.get(SPELL_TYPES, CatalogResponse.class).getBody();
    }

    public CatalogResponse getPowers() {
        return apiService.get(POWERS, CatalogResponse.class).getBody();
    }

    public CatalogResponse getToughnesses() {
        return apiService.get(TOUGHNESSES, CatalogResponse.class).getBody();
    }

    public CatalogResponse getLoyalties() {
        return apiService.get(LOYALTIES, CatalogResponse.class).getBody();
    }

    public CatalogResponse getWaterMarks() {
        return apiService.get(WATERMARKS, CatalogResponse.class).getBody();
    }

    public CatalogResponse getKeywordAbilities() {
        return apiService.get(KEYWORD_ABILITIES, CatalogResponse.class).getBody();
    }

    public CatalogResponse getKeywordActions() {
        return apiService.get(KEYWORD_ACTIONS, CatalogResponse.class).getBody();
    }

    public CatalogResponse getAbilityWords() {
        return apiService.get(ABILITY_WORDS, CatalogResponse.class).getBody();
    }

}