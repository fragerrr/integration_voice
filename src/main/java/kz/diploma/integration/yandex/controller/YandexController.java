package kz.diploma.integration.yandex.controller;

import kz.diploma.integration.yandex.model.request.YandexRequest;
import kz.diploma.integration.yandex.model.response.FilterDataResponse;
import kz.diploma.integration.yandex.service.YandexService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/yandex/integration")
public class YandexController {

    private final YandexService yandexService;

    @PostMapping()
    public ResponseEntity<String> getSpeech(@RequestBody YandexRequest yandexRequest){
        var resp = yandexService.getSpeech(yandexRequest);

        return ResponseEntity.ok(resp);
    }

    @GetMapping("/filter-data")
    public ResponseEntity<FilterDataResponse> getFilterData(){
        var filter = yandexService.getFilterData();
        return ResponseEntity.ok(filter);
    }
}
