package kz.diploma.integration.yandex.access.impl;

import kz.diploma.integration.yandex.access.YandexAccess;
import kz.diploma.integration.yandex.access.request.YandexAccessRequest;
import kz.diploma.integration.yandex.properties.YandexProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Base64;

@Service
@RequiredArgsConstructor
public class YandexAccessImpl implements YandexAccess {
    private final RestTemplate restTemplate;

    @Override
    public String getSpeech(YandexAccessRequest accessRequest) {
        var audioData = restTemplate.postForObject("https://yandex.cloud/api/speechkit/tts", accessRequest, byte[].class);

        return Base64.getEncoder().encodeToString(audioData);
    }

}
