package com.indivaragroup.jdt17.spring.basic.exam;

import com.indivaragroup.jdt17.spring.basic.exam.model.Warehouse;
import com.indivaragroup.jdt17.spring.basic.exam.service.Sales;
import org.springframework.beans.factory.annotation.Qualifier;

public class DistributionService {
    private Warehouse warehouse;
    private Sales firstMotor;
    private Sales secondMotor;
    private Sales thirdMotor;
    private Sales mobilFirst;
    private Sales mobilSecond;

    public DistributionService(Warehouse warehouse,
                               @Qualifier("firstMotor") Sales firstMotor,
                               @Qualifier("secondMotor") Sales secondMotor,
                               @Qualifier("thirdMotor") Sales thirdMotor,
                               @Qualifier("mobilFirst") Sales mobilFirst,
                               @Qualifier("mobilSecond") Sales mobilSecond) {
        this.warehouse = warehouse;
        this.firstMotor = firstMotor;
        this.secondMotor = secondMotor;
        this.thirdMotor = thirdMotor;
        this.mobilFirst = mobilFirst;
        this.mobilSecond = mobilSecond;
    }

    public void distributeItem() {
        System.out.println("Sales---------------");
        System.out.println("Name: " + firstMotor.getName() + " | Region: " + firstMotor.getRegion() + " | Vehicle: " + firstMotor.getVehicleType() + " | " + warehouse.getWarehouseName() + " | " + warehouse.getStock());
        System.out.println("Name: " + secondMotor.getName() + " | Region: " + secondMotor.getRegion() + " | Vehicle: " + secondMotor.getVehicleType() + " | " + warehouse.getWarehouseName() + " | " + warehouse.getStock());
        System.out.println("Name: " + thirdMotor.getName() + " | Region: " + thirdMotor.getRegion() + " | Vehicle: " + thirdMotor.getVehicleType() + " | " + warehouse.getWarehouseName() + " | " + warehouse.getStock());
        System.out.println("Name: " + mobilFirst.getName() + " | Region: " + mobilFirst.getRegion() + " | Vehicle: " + mobilFirst.getVehicleType() + " | " + warehouse.getWarehouseName() + " | " + warehouse.getStock());
        System.out.println("Name: " + mobilSecond.getName() + " | Region: " + mobilSecond.getRegion() + " | Vehicle: " + mobilSecond.getVehicleType() + " | " + warehouse.getWarehouseName() + " | " + warehouse.getStock());

    }
}
