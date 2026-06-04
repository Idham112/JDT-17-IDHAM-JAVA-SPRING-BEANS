package com.indivaragroup.jdt17.spring.basic.configuration;

import com.indivaragroup.jdt17.spring.basic.dto.HelloDTO;
import com.indivaragroup.jdt17.spring.basic.dto.WorldDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class DependsOnConfig {

    @Bean
    @DependsOn(value = "worldDTO")
    public HelloDTO helloDTO() {
        System.out.println("run hello");
        return new HelloDTO();
    }

    @Bean
    public WorldDTO worldDTO() {
        System.out.println("run world");
        return new WorldDTO();
    }
}
