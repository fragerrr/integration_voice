package kz.diploma.integration.yandex.model.response;

import lombok.Data;

import java.util.List;

@Data
public class FilterDataResponse {
    public List<FilterDataResponseItem> speakers;
}
