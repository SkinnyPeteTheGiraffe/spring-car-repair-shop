package com.bobbyplunkett.springcarrepairshop.services;

import com.bobbyplunkett.springcarrepairshop.model.Mechanic;

import java.util.Set;

/**
 * com.bobbyplunkett.springcarrepairshop.services
 *
 * @author Bobby Plunkett
 * @version 0.0.1
 * @since 5/5/2019
 */
public interface MechanicService {

    Mechanic findById(Long id);

    Mechanic save(Mechanic mechanic);

    Set<Mechanic> findAll();
}
