package com.bobbyplunkett.springcarrepairshop.services.map;

import com.bobbyplunkett.springcarrepairshop.model.Vehicle;
import com.bobbyplunkett.springcarrepairshop.services.CrudService;

import java.util.Set;

/**
 * com.bobbyplunkett.springcarrepairshop.services.map
 *
 * @author Bobby Plunkett
 * @version 0.0.1
 * @since 5/5/2019
 */
public class VehicleMapService extends AbstractMapService<Vehicle, Long> implements CrudService<Vehicle, Long> {

    @Override
    public Set<Vehicle> findAll() {
        return super.findAll();
    }

    @Override
    public Vehicle findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vehicle save(Vehicle object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Vehicle object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
