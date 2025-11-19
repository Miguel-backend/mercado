package br.com.senai.backend.sistema_mercado.configs;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "Zaltin's Market",
        version = "1.0",
        description = "Desenvolvido por Miguel S Izaltino"
    )
)
public class Swagger {

}
