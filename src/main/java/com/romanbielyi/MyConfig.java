package com.romanbielyi;

import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    public MyConfig() {
        System.out.println("Default simple config was enabled");
    }
}
