package com.bobbyplunkett.springcarrepairshop.services;

import com.bobbyplunkett.springcarrepairshop.model.Owner;

import java.util.Set;

/**
 * com.bobbyplunkett.springcarrepairshop.services
 *
 * @author Bobby Plunkett
 * @version 0.0.1
 * @since 5/5/2019
 */
public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
