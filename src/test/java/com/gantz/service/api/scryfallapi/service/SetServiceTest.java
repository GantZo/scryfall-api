package com.gantz.service.api.scryfallapi.service;

import com.gantz.service.api.scryfallapi.domain.ScryFallSet;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static com.gantz.service.api.scryfallapi.service.ScryFallConstants.SetApi.*;
import static com.gantz.service.api.scryfallapi.service.ScryFallConstants.SetApi.BY_ID;

@SpringBootTest
public class SetServiceTest {

    @Autowired
    private ScryFallApiService apiService;

    @Test
    public void getListTest() {
        SetListResponse response = apiService.get(SETS, SetListResponse.class).getBody();
        Assert.assertNotNull(response);
        Assert.assertNotNull(response.data);
        Assert.assertNotEquals(response.data.size(), 0);
        Assert.assertNotNull(response.hasMore);
    }

    @Test
    public void getByCodeTest() {
        ScryFallSet scryFallSet = apiService.get(BY_CODE, ScryFallSet.class, "mmq").getBody();
        Assert.assertNotNull(scryFallSet);
        Assert.assertEquals(scryFallSet.getCode(), "mmq");
    }

    @Test
    public void getByTcgplayerIdTest() {
        ScryFallSet scryFallSet = apiService.get(BY_TCGPLAYER_ID, ScryFallSet.class, 1909).getBody();
        Assert.assertNotNull(scryFallSet);
        Assert.assertEquals(scryFallSet.getCode(), "mp2");
    }

    @Test
    public void getByIdTest() {
        ScryFallSet scryFallSet = apiService.get(BY_ID, ScryFallSet.class, "2ec77b94-6d47-4891-a480-5d0b4e5c9372").getBody();
        Assert.assertNotNull(scryFallSet);
        Assert.assertEquals(scryFallSet.getCode(), "uma");
    }

}
