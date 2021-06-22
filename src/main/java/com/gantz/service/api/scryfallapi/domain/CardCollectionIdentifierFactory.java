package com.gantz.service.api.scryfallapi.domain;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CardCollectionIdentifierFactory {

    private final List<Map<String, Object>> identifiers = new LinkedList<>();

    private CardCollectionIdentifierFactory() {
    }

    public static CardCollectionIdentifierFactory of() {
        return new CardCollectionIdentifierFactory();
    }

    private Map<String, Object> mapBuilder(String key, Object value) {
        Map<String, Object> map = new HashMap<>(2);
        map.put(key, value);
        return map;
    }

    public List<Map<String, Object>> build() {
        return identifiers;
    }

    public CardCollectionIdentifierFactory byId(String id) {
        identifiers.add(mapBuilder("id", id));
        return this;
    }

    public CardCollectionIdentifierFactory byMtgoId(Integer id) {
        identifiers.add(mapBuilder("mtgo_id", id));
        return this;
    }

    public CardCollectionIdentifierFactory byMultiverseId(Integer id) {
        identifiers.add(mapBuilder("multiverse_id", id));
        return this;
    }

    public CardCollectionIdentifierFactory byOracleId(String id) {
        identifiers.add(mapBuilder("oracle_id", id));
        return this;
    }

    public CardCollectionIdentifierFactory byIllustrationId(String id) {
        identifiers.add(mapBuilder("illustration_id", id));
        return this;
    }

    public CardCollectionIdentifierFactory byName(String name) {
        identifiers.add(mapBuilder("name", name));
        return this;
    }

    public IdentifierBuilder bySet(String set) {
        return new IdentifierBuilder(this, mapBuilder("set", set));
    }

    public class IdentifierBuilder {
        private CardCollectionIdentifierFactory factory;
        private Map<String, Object> identifiersMap;
        IdentifierBuilder(CardCollectionIdentifierFactory factory, Map<String, Object> identifiersMap) {
            this.factory = factory;
            this.identifiersMap = identifiersMap;
        }

        public CardCollectionIdentifierFactory andName(String name) {
            identifiersMap.put("name", name);
            factory.identifiers.add(identifiersMap);
            return factory;
        }

        public CardCollectionIdentifierFactory andCollectorsNumber(String number) {
            identifiersMap.put("collector_number", number);
            factory.identifiers.add(identifiersMap);
            return factory;
        }

    }

}
