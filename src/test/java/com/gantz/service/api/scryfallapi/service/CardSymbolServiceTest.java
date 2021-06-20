package com.gantz.service.api.scryfallapi.service;

import com.gantz.service.api.scryfallapi.domain.ManaCost;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CardSymbolServiceTest {

    @Autowired
    private CardSymbolServiceImpl cardSymbolService;

    @Test
    public void getAllTest() {
        CardSymbolResponse response = cardSymbolService.getAll();
        Assert.assertNotNull(response);
        Assert.assertNotNull(response.hasMore);
        Assert.assertNotNull(response.data);
        Assert.assertNotEquals(response.data.size(), 0);
    }

    @Test
    public void parseCostTest() {
        ManaCost cost = cardSymbolService.parseCost("RUx");
        Assert.assertNotNull(cost);
        Assert.assertEquals(cost.getCmc(), 2.0, 0.00001);
        Assert.assertEquals(cost.getCost(), "{X}{U}{R}");
        Assert.assertEquals(cost.getColorless(), false);
        Assert.assertEquals(cost.getMonocolored(), false);
        Assert.assertEquals(cost.getMulticolored(), true);
    }

}
