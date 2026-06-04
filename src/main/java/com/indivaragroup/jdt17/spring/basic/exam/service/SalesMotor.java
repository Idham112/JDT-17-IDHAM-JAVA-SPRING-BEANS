package com.indivaragroup.jdt17.spring.basic.exam.service;

public class SalesMotor implements Sales{
    String name;
    String region;

    public SalesMotor(String name, String region) {
        this.name = name;
        this.region = region;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getRegion() {
        return region;
    }

    @Override
    public String getVehicleType() {
        return "Motor";
    }
}
