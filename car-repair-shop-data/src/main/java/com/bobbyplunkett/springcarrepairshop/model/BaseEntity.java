package com.bobbyplunkett.springcarrepairshop.model;

import java.io.Serializable;

/**
 * com.bobbyplunkett.springcarrepairshop.model
 *
 * @author Bobby Plunkett
 * @version 0.0.1
 * @since 5/5/2019
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
