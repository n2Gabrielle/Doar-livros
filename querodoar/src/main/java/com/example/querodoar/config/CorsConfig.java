package com.example.querodoar.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Permite acesso a todos os endpoints
                .allowedOrigins("http://localhost:5174") // Origem do front-end
                .allowedMethods("*") // Todos os métodos HTTP
                .allowedHeaders("*") // Todos os cabeçalhos permitidos
                .allowCredentials(true); // Permite envio de cookies/credenciais
    }
}    

