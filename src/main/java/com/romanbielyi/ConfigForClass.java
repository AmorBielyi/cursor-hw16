package com.romanbielyi;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(ConfigurationEnabler.class)
public class ConfigForClass {
    public ConfigForClass() {
        System.out.println("ConfigForClass was enabled");
    }
}
