package com.gantz.service.api.scryfallapi.config;

import com.gantz.service.api.scryfallapi.service.ScryFallApiErrorHandler;
import com.gantz.service.api.scryfallapi.service.ScryFallApiService;
import com.gantz.service.api.scryfallapi.service.ScryFallApiServiceImpl;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ScryFallApiServiceConfiguration {

    @Bean
    public ScryFallApiService apiService() {
        return new ScryFallApiServiceImpl(new RestTemplateBuilder(), scryFallApiErrorHandler());
    }

    @Bean
    public ScryFallApiErrorHandler scryFallApiErrorHandler() {
        return new ScryFallApiErrorHandler();
    }

}
