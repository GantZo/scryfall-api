package com.gantz.service.api.scryfallapi.service;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertNotNull;

@SpringBootTest
public class CatalogServiceTest {

    @Autowired
    private CatalogServiceImpl catalogService;

    @Test
    void catalogTest() {
        CatalogResponse response = catalogService.getArtifactTypes();
        assertNotNull(response.getObject());
        assertNotNull(response.getTotalValues());
        assertNotNull(response.getUri());
        assertNotNull(response.getData());
        Assert.assertNotEquals(response.getData().size(), 0);
    }

}