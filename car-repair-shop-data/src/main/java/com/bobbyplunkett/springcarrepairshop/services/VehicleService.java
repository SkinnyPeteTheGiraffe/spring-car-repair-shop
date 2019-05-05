package com.bobbyplunkett.springcarrepairshop.services;

import com.bobbyplunkett.springcarrepairshop.model.Vehicle;

import java.util.Set;

/**
 * com.bobbyplunkett.springcarrepairshop.services
 *
 * @author Bobby Plunkett
 * @version 0.0.1
 * @since 5/5/2019
 */
public interface VehicleService {

    Vehicle findById(Long id);

    Vehicle save(Vehicle vehicle);

    Set<Vehicle> findAll();
}
