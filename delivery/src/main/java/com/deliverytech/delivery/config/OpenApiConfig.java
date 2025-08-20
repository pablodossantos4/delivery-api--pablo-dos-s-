package com.deliverytech.delivery.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

  @Bean
  public OpenAPI customOpenAPI() {
    return new OpenAPI()
        .info(new Info()
            .title("Delivery API")
            .version("1.0")
            .description("API para sistema de delivery")
            .contact(new Contact()
                .name("Delivery Tech")
                .email("contato@deliverytech.com")))
        .components(new io.swagger.v3.oas.models.Components()
        );
  }
}