package kz.diploma.integration.yandex.model.request;

import kz.diploma.integration.yandex.model.request.enums.SpeakerEnum;
import lombok.Data;

@Data
public class YandexRequest {
    public String text;
    public SpeakerEnum speaker;
}
