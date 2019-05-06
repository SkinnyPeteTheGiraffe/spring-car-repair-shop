package com.bobbyplunkett.springcarrepairshop.services.map;

import com.bobbyplunkett.springcarrepairshop.model.Mechanic;
import com.bobbyplunkett.springcarrepairshop.services.MechanicService;

import java.util.Set;

/**
 * com.bobbyplunkett.springcarrepairshop.services.map
 *
 * @author Bobby Plunkett
 * @version 0.0.1
 * @since 5/5/2019
 */
public class MechanicMapService extends AbstractMapService<Mechanic, Long> implements MechanicService {

    @Override
    public Set<Mechanic> findAll() {
        return super.findAll();
    }

    @Override
    public Mechanic findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Mechanic save(Mechanic object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Mechanic object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
