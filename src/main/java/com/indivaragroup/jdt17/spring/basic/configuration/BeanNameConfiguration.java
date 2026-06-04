package com.indivaragroup.jdt17.spring.basic.configuration;

import com.indivaragroup.jdt17.spring.basic.dto.HelloDTO;
import com.indivaragroup.jdt17.spring.basic.dto.WorldDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanNameConfiguration {

    @Bean(name = "helloSatu")
    public HelloDTO helloDTO() {
        return new HelloDTO();
    }

    @Bean(name = "worldSatu")
    public WorldDTO worldDTO() {
        return new WorldDTO();
    }
}
