package kz.diploma.integration.yandex.service.impl;

import kz.diploma.integration.yandex.access.YandexAccess;
import kz.diploma.integration.yandex.access.request.YandexAccessRequest;
import kz.diploma.integration.yandex.model.request.YandexRequest;
import kz.diploma.integration.yandex.model.response.FilterDataResponse;
import kz.diploma.integration.yandex.service.YandexService;
import kz.diploma.integration.yandex.util.YandexUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class YandexServiceImpl implements YandexService {
    private final YandexAccess yandexAccess;

    @Override
    public String getSpeech(YandexRequest yandexRequest) {
        var accessRequest = createAccessRequest(yandexRequest);

        return yandexAccess.getSpeech(accessRequest);
    }

    private YandexAccessRequest createAccessRequest(YandexRequest yandexRequest){
        var accessRequest = new YandexAccessRequest();
        accessRequest.message = yandexRequest.text;
        accessRequest.language = "kz-kz";
        accessRequest.speed = 1;
        accessRequest.voice = yandexRequest.speaker.name;
        accessRequest.emotion = null;
        accessRequest.format = "lpcm";

        return accessRequest;
    }

    @Override
    public FilterDataResponse getFilterData(){
        var resp = new FilterDataResponse();
        resp.speakers = YandexUtil.getAllSpeakers();
        return resp;
    }
}
