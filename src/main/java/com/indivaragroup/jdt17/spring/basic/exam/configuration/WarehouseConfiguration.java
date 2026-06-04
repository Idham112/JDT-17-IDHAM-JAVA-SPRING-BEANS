package com.indivaragroup.jdt17.spring.basic.exam.configuration;

import com.indivaragroup.jdt17.spring.basic.exam.model.Warehouse;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WarehouseConfiguration {

    @Bean
    public Warehouse warehouse() {
        Warehouse warehouse = new Warehouse("Gudang Utama", 1000);
        return warehouse;
    }
}
