package com.bobbyplunkett.springcarrepairshop.model;

/**
 * com.bobbyplunkett.springcarrepairshop.model
 *
 * @author Bobby Plunkett
 * @version 0.0.1
 * @since 5/4/2019
 */
public class Vehicle extends BaseEntity {

    private VehicleType vehicleType;
    private Owner owner;
    private Integer year;

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
