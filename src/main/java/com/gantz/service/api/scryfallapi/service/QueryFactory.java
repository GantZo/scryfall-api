package com.gantz.service.api.scryfallapi.service;

import com.gantz.service.api.scryfallapi.domain.ImageVersion;
import com.gantz.service.api.scryfallapi.domain.OutputFormat;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QueryFactory {

    private final String incomingUri;
    private final Pattern pattern = Pattern.compile("\\{(.+?)\\}");
    private final Map<QueryParameter, String> calculatedParameters = new HashMap<>();

    private QueryFactory(String incomingUri) {
        this.incomingUri = incomingUri;
    }

    public static QueryFactory of(String uri) {
        return new QueryFactory(uri).parseUri();
    }

    public QueryFactory id(Object id) {
        calculatedParameters.put(QueryParameter.ID, String.valueOf(id));
        return this;
    }

    public QueryFactory version(ImageVersion version) {
        calculatedParameters.put(QueryParameter.VERSION, Optional.ofNullable(version).orElseGet(ImageVersion::getDefault).getType());
        return this;
    }

    public QueryFactory format(OutputFormat format) {
        calculatedParameters.put(QueryParameter.FORMAT, Optional.ofNullable(format).orElseGet(OutputFormat::getDefault).name().toLowerCase());
        return this;
    }

    public QueryFactory pretty(boolean value) {
        calculatedParameters.put(QueryParameter.PRETTY, String.valueOf(value));
        return this;
    }

    public String build() {
        String tempString = incomingUri;
        for (Map.Entry<QueryParameter, String> pair : calculatedParameters.entrySet()) {
            Pattern p = Pattern.compile("\\{" + pair.getKey().getCode() + "\\}");
            Matcher m = p.matcher(tempString);
            if (m.find()) {
                tempString = m.replaceAll(Optional.ofNullable(pair.getValue()).orElse(""));
            }
        }
        return tempString;
    }

    private QueryFactory parseUri() {
        String tempUrl = incomingUri;
        Matcher m;
        while ((m = pattern.matcher(tempUrl)).find()) {
            Optional.ofNullable(QueryParameter.valueByCode(m.group(1))).ifPresent(p -> calculatedParameters.put(p, ""));
            tempUrl = m.replaceFirst("");
        }
        return this;
    }

}
