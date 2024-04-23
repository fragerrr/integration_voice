package kz.diploma.integration.yandex.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "yandex")
public class YandexProperties {
    public String url;
}
