package com.gantz.service.api.scryfallapi.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import java.net.URI;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Card extends CardFaceObject {

    private String object;

    private String id;
    @JsonProperty("arena_id")
    private Integer arenaId;
    private String lang;
    @JsonProperty("mtgo_id")
    private Integer mtgoId;
    @JsonProperty("mtgo_foil_id")
    private Integer mtgoFoilId;
    @JsonProperty("multiverse_ids")
    private List<Integer> multiverseId;
    @JsonProperty("tcgplayer_id")
    private Integer tcgPlayerId;
    @JsonProperty("cardmarket_id")
    private Integer cardMarketId;
    @JsonProperty("oracle_id")
    private String oracleId;
    @JsonProperty("prints_search_uri")
    private URI printsSearchUri;
    @JsonProperty("rulings_uri")
    private URI rulingsUri;
    @JsonProperty("scryfall_uri")
    private URI scryFallUri;
    private URI uri;

    @JsonProperty("all_parts")
    private List<RelatedCardObject> allParts;
    @JsonProperty("card_faces")
    private List<CardFaceObject> cardFaces;
    @JsonProperty("cmc")
    private Double cmc;
    @JsonProperty("color_identity")
    private List<Color> colorIdentity;
    @JsonProperty("edhrec_rank")
    private Integer edhRecRank;
    @JsonProperty("foil")
    private Boolean foil;
    @JsonProperty("hand_modifier")
    private String handModifier;
    @JsonProperty("keywords")
    private List<String> keywords;
    @JsonProperty("layout")
    private String layout;
    @JsonProperty("legalities")
    private Map<String, String> legalities;
    @JsonProperty("life_modifier")
    private String lifeModifier;
    @JsonProperty("nonfoil")
    private Boolean nonFoil;
    @JsonProperty("oversized")
    private Boolean overSized;
    @JsonProperty("produced_mana")
    private List<Color> producedMana;
    @JsonProperty("reserved")
    private Boolean reserved;

    @JsonProperty("booster")
    private Boolean booster;
    @JsonProperty("border_color")
    private String borderColor;
    @JsonProperty("card_back_id")
    private String cardBackId;
    @JsonProperty("collector_number")
    private String collectorNumber;
    @JsonProperty("content_warning")
    private Boolean contentWarning;
    @JsonProperty("digital")
    private Boolean digital;
    @JsonProperty("flavor_name")
    private String flavorName;
    @JsonProperty("frame_effects")
    private List<String> frameEffects;
    @JsonProperty("frame")
    private String frame;
    @JsonProperty("full_art")
    private Boolean fullArt;
    @JsonProperty("games")
    private List<String> games;
    @JsonProperty("highres_image")
    private Boolean highResImage;
    @JsonProperty("prices")
    private Map<String, String> prices;
    @JsonProperty("promo")
    private Boolean promo;
    @JsonProperty("promo_types")
    private List<String> promoTypes;
    @JsonProperty("purchase_uris")
    private Map<String, URI> purchaseUris;
    @JsonProperty("rarity")
    private String rarity;
    @JsonProperty("related_uris")
    private Map<String, URI> relatedUris;
    @JsonProperty("released_at")
    private LocalDate releasedAt;
    @JsonProperty("reprint")
    private Boolean reprint;
    @JsonProperty("scryfall_set_uri")
    private URI scryFallSetUri;
    @JsonProperty("set_name")
    private String setName;
    @JsonProperty("set_search_uri")
    private URI setSearchUri;
    @JsonProperty("set_type")
    private String setType;
    @JsonProperty("set_uri")
    private URI setUri;
    @JsonProperty("set")
    private String set;
    @JsonProperty("story_spotlight")
    private Boolean storySpotlight;
    @JsonProperty("textless")
    private Boolean textLess;
    @JsonProperty("variation")
    private Boolean variation;
    @JsonProperty("variation_of")
    private String variationOf;
    @JsonProperty("preview")
    private PreviewObject preview;

}