package com.indivaragroup.jdt17.spring.basic.exam;

import com.indivaragroup.jdt17.spring.basic.exam.model.Warehouse;
import com.indivaragroup.jdt17.spring.basic.exam.service.Sales;
import org.springframework.beans.factory.annotation.Qualifier;

public class DistributionService {
    private Warehouse warehouse;
    private Sales sale1;
    private Sales sale2;
    private Sales sale3;
    private Sales sale4;
    private Sales sale5;

    public DistributionService(Warehouse warehouse,
                               Sales sale1,
                               Sales sale2,
                               Sales sale3,
                               Sales sale4,
                               Sales sale5) {
        this.warehouse = warehouse;
        this.sale1 = sale1;
        this.sale2 = sale2;
        this.sale3 = sale3;
        this.sale4 = sale4;
        this.sale5 = sale5;
    }

    public void distributeItem() {
        System.out.println("Sales---------------");
        System.out.println("Name: " + sale1.getName() + " | Region: " + sale1.getRegion() + " | Vehicle: " + sale1.getVehicleType() + " | " + warehouse.getWarehouseName() + " | " + warehouse.getStock());
        System.out.println("Name: " + sale2.getName() + " | Region: " + sale2.getRegion() + " | Vehicle: " + sale2.getVehicleType() + " | " + warehouse.getWarehouseName() + " | " + warehouse.getStock());
        System.out.println("Name: " + sale3.getName() + " | Region: " + sale3.getRegion() + " | Vehicle: " + sale3.getVehicleType() + " | " + warehouse.getWarehouseName() + " | " + warehouse.getStock());
        System.out.println("Name: " + sale4.getName() + " | Region: " + sale4.getRegion() + " | Vehicle: " + sale4.getVehicleType() + " | " + warehouse.getWarehouseName() + " | " + warehouse.getStock());
        System.out.println("Name: " + sale5.getName() + " | Region: " + sale5.getRegion() + " | Vehicle: " + sale5.getVehicleType() + " | " + warehouse.getWarehouseName() + " | " + warehouse.getStock());

    }
}
