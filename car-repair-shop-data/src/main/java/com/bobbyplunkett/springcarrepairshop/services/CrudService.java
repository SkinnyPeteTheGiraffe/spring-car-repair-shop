package com.bobbyplunkett.springcarrepairshop.services;

import java.util.Set;

/**
 * com.bobbyplunkett.springcarrepairshop.services
 *
 * @author Bobby Plunkett
 * @version 0.0.1
 * @since 5/5/2019
 */
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
