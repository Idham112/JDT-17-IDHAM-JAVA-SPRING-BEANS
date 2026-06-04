package com.indivaragroup.jdt17.spring.basic.configuration;


import com.indivaragroup.jdt17.spring.basic.dto.HelloDTO;
import com.indivaragroup.jdt17.spring.basic.dto.WorldDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public HelloDTO hello() {
        return new HelloDTO();
    }

    @Bean
    public WorldDTO world() {
        return new WorldDTO();
    }
}
