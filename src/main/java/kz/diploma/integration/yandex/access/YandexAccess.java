package kz.diploma.integration.yandex.access;

import kz.diploma.integration.yandex.access.request.YandexAccessRequest;

public interface YandexAccess {
    String getSpeech(YandexAccessRequest accessRequest);
}
