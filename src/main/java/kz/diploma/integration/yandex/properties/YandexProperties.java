package kz.diploma.integration.yandex.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "yandex")
public class YandexProperties {
    public String url;
}
