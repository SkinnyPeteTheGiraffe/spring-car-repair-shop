package com.bobbyplunkett.springcarrepairshop.services.map;

import com.bobbyplunkett.springcarrepairshop.model.Vehicle;
import com.bobbyplunkett.springcarrepairshop.services.VehicleService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * com.bobbyplunkett.springcarrepairshop.services.map
 *
 * @author Bobby Plunkett
 * @version 0.0.1
 * @since 5/5/2019
 */
@Service
public class VehicleMapService extends AbstractMapService<Vehicle, Long> implements VehicleService {

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
        return super.save(object);
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
