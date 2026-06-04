package com.indivaragroup.jdt17.spring.basic.configuration;

import com.indivaragroup.jdt17.spring.basic.dto.HelloDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DuplicateBeanConfiguration {

    @Bean
    public HelloDTO hello1() {
        return new HelloDTO();
    }

    @Bean
    public HelloDTO hello2() {
        return new HelloDTO();
    }
}
