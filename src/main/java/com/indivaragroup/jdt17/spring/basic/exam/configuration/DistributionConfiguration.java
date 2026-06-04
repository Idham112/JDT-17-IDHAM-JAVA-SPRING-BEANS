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
            @Qualifier("firstMotor") Sales sale1,
            @Qualifier("secondMotor") Sales sale2,
            @Qualifier("thirdMotor") Sales sale3,
            @Qualifier("mobilFirst") Sales sale4,
            @Qualifier("mobilSecond") Sales sale5) {
        return new DistributionService(warehouse, sale1, sale2, sale3, sale4, sale5);
    }
}
