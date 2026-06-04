package com.indivaragroup.jdt17.spring.basic.exam.model;

public class Warehouse {
    String warehouseName;
    int stock;

    public Warehouse(String warehouseName, int stock) {
        this.warehouseName = warehouseName;
        this.stock = stock;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
