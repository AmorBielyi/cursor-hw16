package com.romanbielyi;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigForBean {
    public ConfigForBean() {
        System.out.println("ConfigForBean was enabled");
    }

    @Bean
    @ConditionalOnProperty(value = "custom.configuration.enabled", havingValue = "true")
    public String getBean() {
        System.out.println("Hello, I am a bean, and I was created by enabled specific property");
        return "I am bean was created by property";
    }
}
