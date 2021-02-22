package com.gantz.service.api.scryfallapi.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import java.net.URI;
import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CardFaceObject {

    @JsonProperty("object")
    protected String object;

    @JsonProperty("artist")
    protected String artist;
    @JsonProperty("colors")
    protected List<Color> colors;
    @JsonProperty("color_indicator")
    protected List<Color> colorIndicator;
    @JsonProperty("flavor_text")
    protected String flavorText;
    @JsonProperty("illustration_id")
    protected String illustrationId;
    @JsonProperty("image_uris")
    protected Map<String, URI> imageUris;
    @JsonProperty("mana_cost")
    protected String manaCost;
    @JsonProperty("name")
    protected String name;
    @JsonProperty("oracle_text")
    protected String oracleText;
    @JsonProperty("loyalty")
    protected String loyalty;
    @JsonProperty("power")
    protected String power;
    @JsonProperty("toughness")
    protected String toughness;
    @JsonProperty("printed_name")
    protected String printedName;
    @JsonProperty("printed_text")
    protected String printedText;
    @JsonProperty("printed_type_line")
    protected String printedTypeLine;
    @JsonProperty("type_line")
    protected String typeLine;
    @JsonProperty("watermark")
    protected String watermark;

}