package com.gantz.service.api.scryfallapi.service;

import com.gantz.service.api.scryfallapi.domain.ScryFallSet;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import static com.gantz.service.api.scryfallapi.service.ScrFallConstants.SetApi.*;

@Service
@Log4j2
public class SetServiceImpl {

    private final ScryFallApiService apiService;

    public SetServiceImpl(ScryFallApiService apiService) {
        this.apiService = apiService;
    }

    public SetListResponse getList() {
        return apiService.get(SETS, SetListResponse.class).getBody();
    }

    public ScryFallSet getByCode(String code) {
        return apiService.get(BY_CODE, ScryFallSet.class, code).getBody();
    }

    public ScryFallSet getByTcgplayerId(Integer id) {
        return apiService.get(BY_TCGPLAYER_ID, ScryFallSet.class, id).getBody();
    }

    public ScryFallSet getById(String id) {
        return apiService.get(BY_ID, ScryFallSet.class, id).getBody();
    }

}
