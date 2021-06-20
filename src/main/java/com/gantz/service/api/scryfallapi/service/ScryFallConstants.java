package com.gantz.service.api.scryfallapi.service;

public class ScryFallConstants {

    public final static String API_URI = "https://api.scryfall.com";

    public static class CatalogApi {
        public final static String CARD_NAMES = "/catalog/card-names";
        public final static String ARTIST_NAMES = "/catalog/artist-names";
        public final static String WORD_BANK = "/catalog/word-bank";
        public final static String CREATURE_TYPES = "/catalog/creature-types";
        public final static String PLANESWALKER_TYPES = "/catalog/planeswalker-types";
        public final static String LAND_TYPES = "/catalog/land-types";
        public final static String ARTIFACT_TYPES = "/catalog/artifact-types";
        public final static String ENCHANTMENT_TYPES = "/catalog/enchantment-types";
        public final static String SPELL_TYPES = "/catalog/spell-types";
        public final static String POWERS = "/catalog/powers";
        public final static String TOUGHNESSES = "/catalog/toughnesses";
        public final static String LOYALTIES = "/catalog/loyalties";
        public final static String WATERMARKS = "/catalog/watermarks";
        public final static String KEYWORD_ABILITIES = "/catalog/keyword-abilities";
        public final static String KEYWORD_ACTIONS = "/catalog/keyword-actions";
        public final static String ABILITY_WORDS = "/catalog/ability-words";
    }

    public static class RulingApi {
        public final static String BY_MUILTIVERSE_ID = "/cards/multiverse/{id}/rulings";
        public final static String BY_MTGO_ID = "/cards/mtgo/{id}/rulings";
        public final static String BY_ARENA_ID = "/cards/arena/{id}/rulings";
        public final static String BY_CODE_NUMBER = "/cards/{code}/{number}/rulings";
        public final static String BY_ID = "/cards/{id}/rulings";
    }

    public static class SetApi {
        public final static String SETS = "/sets";
        public final static String BY_CODE = "/sets/{code}";
        public final static String BY_TCGPLAYER_ID = "/sets/tcgplayer/{id}";
        public final static String BY_ID = "/sets/{id}";
    }

}