package com.sweep.memberservice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry){
        registry.addMapping("/**")
                .allowedOrigins("http://210.109.60.247:10023", "http://localhost:8762", "http://localhost:3000", "https://member.ddns.net")
                .allowedMethods("*")
                .allowedHeaders("*")
                .allowCredentials(true);
    }
}
