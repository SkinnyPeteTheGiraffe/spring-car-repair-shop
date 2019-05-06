package com.bobbyplunkett.springcarrepairshop.services.map;

import com.bobbyplunkett.springcarrepairshop.model.Owner;
import com.bobbyplunkett.springcarrepairshop.services.CrudService;

import java.util.Set;

/**
 * com.bobbyplunkett.springcarrepairshop.services.map
 *
 * @author Bobby Plunkett
 * @version 0.0.1
 * @since 5/5/2019
 */
public class OwnerMapService extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
