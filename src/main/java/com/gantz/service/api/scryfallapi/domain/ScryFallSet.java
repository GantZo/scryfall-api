package com.gantz.service.api.scryfallapi.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import java.net.URI;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ScryFallSet {

    private String id;
    private String code;
    @JsonProperty("mtgo_code")
    private String mtgoCode;
    @JsonProperty("tcgplayer_id")
    private Integer tcgPlayerId;
    private String name;
    @JsonProperty("set_type")
    private String setType;
    @JsonProperty("released_at")
    private LocalDate releasedAt;
    @JsonProperty("block_code")
    private String blockCode;
    @JsonProperty("block")
    private String block;
    @JsonProperty("parent_set_code")
    private String parentSetCode;
    @JsonProperty("card_count")
    private Integer cardCount;
    @JsonProperty("printed_size")
    private Integer printedSize;
    private Boolean digital;
    @JsonProperty("foil_only")
    private Boolean foilOnly;
    @JsonProperty("nonfoil_only")
    private Boolean nonFoilOnly;
    @JsonProperty("scryfall_uri")
    private URI scryFallUri;
    @JsonProperty("uri")
    private URI uri;
    @JsonProperty("icon_svg_uri")
    private URI iconSvgUri;
    @JsonProperty("search_uri")
    private URI searchUri;

}
