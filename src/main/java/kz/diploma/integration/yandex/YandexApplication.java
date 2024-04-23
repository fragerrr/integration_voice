package kz.diploma.integration.yandex;

import kz.diploma.integration.yandex.properties.YandexProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(value = YandexProperties.class)
public class YandexApplication {

	public static void main(String[] args) {
		SpringApplication.run(YandexApplication.class, args);
	}

}
