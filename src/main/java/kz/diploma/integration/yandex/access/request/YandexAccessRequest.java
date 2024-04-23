package kz.diploma.integration.yandex.access.request;

import lombok.Data;

@Data
public class YandexAccessRequest {
    public String message;
    public String language;
    public Integer speed;
    public String voice;
    public String emotion;
    public String format;
}
