package com.gantz.service.api.scryfallapi.service;

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
@EqualsAndHashCode(callSuper = true)
@ToString
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class ListResponse<T> extends ScryFallResponse<T> {

    @JsonProperty("has_more")
    protected Boolean hasMore;
    @JsonProperty("next_page")
    protected URI nextPage;
    @JsonProperty("total_cards")
    protected Integer totalCards;
    @JsonProperty("warnings")
    protected List<String> warnings;

}