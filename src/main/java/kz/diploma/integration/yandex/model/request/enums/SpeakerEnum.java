package kz.diploma.integration.yandex.model.request.enums;

public enum SpeakerEnum {
    //en
    JOHN("john", GenderEnum.M, LanguageEnum.EN),
    //kz
    MADI("madi", GenderEnum.M, LanguageEnum.KZ),
    AMIRA("amira", GenderEnum.W, LanguageEnum.KZ),
    //ru
    MARINA("marina", GenderEnum.M, LanguageEnum.RU),
    ANTON("anton", GenderEnum.M, LanguageEnum.RU);

    public final String name;
    public final GenderEnum gender;
    public final LanguageEnum language;

    SpeakerEnum(String name, GenderEnum gender, LanguageEnum language) {
        this.name = name;
        this.gender = gender;
        this.language = language;
    }
}
