package com.bobbyplunkett.springcarrepairshop.services;

import com.bobbyplunkett.springcarrepairshop.model.Owner;

/**
 * com.bobbyplunkett.springcarrepairshop.services
 *
 * @author Bobby Plunkett
 * @version 0.0.1
 * @since 5/5/2019
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
