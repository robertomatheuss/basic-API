package dio.my_first_api;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "My first API",version = "1",description = "My first API, developed with Spring"))
public class MyFirstApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyFirstApiApplication.class, args);
	}

}
