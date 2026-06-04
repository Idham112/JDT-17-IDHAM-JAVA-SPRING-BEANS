package com.indivaragroup.jdt17.spring.basic.exam;

import com.indivaragroup.jdt17.spring.basic.exam.model.Warehouse;
import com.indivaragroup.jdt17.spring.basic.exam.service.Sales;

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
        System.out.println("Sales: " + sale1.getName() + " | Wilayah: " + sale1.getRegion() + " | Kendaraan: " + sale1.getVehicleType() + " | Gudang: " + warehouse.getWarehouseName() + " (" + warehouse.getStock() + ")");
        System.out.println("Sales: " + sale2.getName() + " | Wilayah: " + sale2.getRegion() + " | Kendaraan: " + sale2.getVehicleType() + " | Gudang: " + warehouse.getWarehouseName() + " (" + warehouse.getStock() + ")");
        System.out.println("Sales: " + sale3.getName() + " | Wilayah: " + sale3.getRegion() + " | Kendaraan: " + sale3.getVehicleType() + " | Gudang: " + warehouse.getWarehouseName() + " (" + warehouse.getStock() + ")");
        System.out.println("Sales: " + sale4.getName() + " | Wilayah: " + sale4.getRegion() + " | Kendaraan: " + sale4.getVehicleType() + " | Gudang: " + warehouse.getWarehouseName() + " (" + warehouse.getStock() + ")");
        System.out.println("Sales: " + sale5.getName() + " | Wilayah: " + sale5.getRegion() + " | Kendaraan: " + sale5.getVehicleType() + " | Gudang: " + warehouse.getWarehouseName() + " (" + warehouse.getStock() + ")");

    }
}
