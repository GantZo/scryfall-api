package com.gantz.service.api.scryfallapi.service;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RulingServiceTest {

    @Autowired
    private RulingServiceImpl rulingService;

    @Test
    public void getByMultiverseId() {
        RulingResponse response = rulingService.getByMultiverseId(3255);
        Assert.assertNotNull(response.hasMore);
        Assert.assertNotEquals(response.data.size(), 0);
    }

    @Test
    public void getByMtgoId() {
        RulingResponse response = rulingService.getByMtgoId(57934);
        Assert.assertNotNull(response.hasMore);
        Assert.assertNotEquals(response.data.size(), 0);
    }

    @Test
    public void getByArenaId() {
        RulingResponse response = rulingService.getByArenaId(67462);
        Assert.assertNotNull(response.hasMore);
        Assert.assertNotEquals(response.data.size(), 0);
    }

    @Test
    public void getByCodeNumber() {
        RulingResponse response = rulingService.getByCodeNumber("ima", 65);
        Assert.assertNotNull(response.hasMore);
        Assert.assertNotEquals(response.data.size(), 0);
    }

    @Test
    public void getById() {
        RulingResponse response = rulingService.getById("f2b9983e-20d4-4d12-9e2c-ec6d9a345787");
        Assert.assertNotNull(response.hasMore);
        Assert.assertNotEquals(response.data.size(), 0);
    }

}
