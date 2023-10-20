package one.digitalinnovation.gof.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;


@Configuration
public class SwaggerConfig {
    
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Rest API")
                        .description("Springboot REST API")
                        .contact(new Contact()
                                .name("William Barbosa")
                                .email("wbpereiraa@gmail.com")
                        )
                        .license(new License()
                                .name("Licença")
                                .url("http://www.seusite.com.br")
                        )
                );
    }

}
