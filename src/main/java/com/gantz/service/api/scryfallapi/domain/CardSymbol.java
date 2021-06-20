package com.gantz.service.api.scryfallapi.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import java.net.URI;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CardSymbol {

    private String object;
    private String symbol;
    @JsonProperty("loose_variant")
    private String looseVariant;
    private String english;
    @JsonProperty("transposeable")
    private Boolean transposeAble;
    @JsonProperty("represents_mana")
    private Boolean representsMana;
    private Double cmc;
    @JsonProperty("appears_in_mana_costs")
    private Boolean appearsInManaCosts;
    private Boolean funny;
    @JsonProperty("colors")
    private List<Color> colors;
    @JsonProperty("gatherer_alternates")
    private List<String> gathererAlternates;
    @JsonProperty("svg_uri")
    private URI svgUri;

}