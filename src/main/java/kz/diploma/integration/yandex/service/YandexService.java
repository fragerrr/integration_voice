package kz.diploma.integration.yandex.service;

import kz.diploma.integration.yandex.model.request.YandexRequest;
import kz.diploma.integration.yandex.model.response.FilterDataResponse;

public interface YandexService {
    String getSpeech(YandexRequest yandexRequest);
    FilterDataResponse getFilterData();
}
