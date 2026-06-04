package com.indivaragroup.jdt17.spring.basic.exam.configuration;

import com.indivaragroup.jdt17.spring.basic.exam.service.Sales;
import com.indivaragroup.jdt17.spring.basic.exam.service.SalesMobil;
import com.indivaragroup.jdt17.spring.basic.exam.service.SalesMotor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SalesConfiguration {

    @Bean
    public Sales firstMotor() {
        SalesMotor salesMotor = new SalesMotor("Andi", "Zona A");
        return salesMotor;
    }

    @Bean
    public Sales secondMotor() {
        SalesMotor salesMotor = new SalesMotor("Budi", "Zona B");
        return salesMotor;
    }

    @Bean
    public Sales thirdMotor() {
        SalesMotor salesMotor = new SalesMotor("Cici", "Zona C");
        return salesMotor;
    }

    @Bean
    public Sales mobilFirst() {
        SalesMobil salesMobil = new SalesMobil("Dedi", "Zona D");
        return salesMobil;
    }

    @Bean
    public Sales mobilSecond() {
        SalesMobil salesMobil = new SalesMobil("Eka", "Zona E");
        return salesMobil;
    }
}
