package kz.diploma.integration.yandex.util;

import kz.diploma.integration.yandex.model.request.enums.LanguageEnum;
import kz.diploma.integration.yandex.model.request.enums.SpeakerEnum;
import kz.diploma.integration.yandex.model.response.FilterDataResponseItem;

import java.util.Arrays;
import java.util.List;

public class YandexUtil {
    public static List<SpeakerEnum> getKzSpeakers(){
        return Arrays.stream(SpeakerEnum.values()).filter(l -> l.language == LanguageEnum.KZ).toList();
    }

    public static List<SpeakerEnum> getRuSpeakers(){
        return Arrays.stream(SpeakerEnum.values()).filter(l -> l.language == LanguageEnum.RU).toList();
    }

    public static List<SpeakerEnum> getEnSpeakers(){
        return Arrays.stream(SpeakerEnum.values()).filter(l -> l.language == LanguageEnum.EN).toList();
    }

    public static List<FilterDataResponseItem> getAllSpeakers(){
        return Arrays.stream(SpeakerEnum.values()).map(item -> new FilterDataResponseItem(item.language.name(), item.name)).toList();
    }
}
