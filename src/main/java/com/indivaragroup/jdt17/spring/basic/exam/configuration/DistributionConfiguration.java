package com.indivaragroup.jdt17.spring.basic.exam.configuration;

import com.indivaragroup.jdt17.spring.basic.exam.DistributionService;
import com.indivaragroup.jdt17.spring.basic.exam.model.Warehouse;
import com.indivaragroup.jdt17.spring.basic.exam.service.Sales;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DistributionConfiguration {

    @Bean
    public DistributionService distributionService(
            Warehouse warehouse,
            @Qualifier("firstMotor") Sales firstMotor,
            @Qualifier("secondMotor") Sales secondMotor,
            @Qualifier("thirdMotor") Sales thirdMotor,
            @Qualifier("mobilFirst") Sales mobilFirst,
            @Qualifier("mobilSecond") Sales mobilSecond) {
        return new DistributionService(warehouse, firstMotor, secondMotor, thirdMotor, mobilFirst, mobilSecond);
    }
}
