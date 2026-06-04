package com.indivaragroup.jdt17.spring.basic.configuration;

import com.indivaragroup.jdt17.spring.basic.dto.HelloDTO;
import com.indivaragroup.jdt17.spring.basic.dto.WorldDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class PrimaryBeanConfiguration {

    @Primary
    @Bean
    public WorldDTO world1() {
        return new WorldDTO();
    }

    @Bean
    public WorldDTO world2() {
        return new WorldDTO();
    }
}
