package com.penelopenest.buildingup.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @author penelopeWu
 * @version 1.0
 * @date 2018-04-12 21:47
 */
@Data
public class Customer implements Serializable {
    private static final long serialVersionUID = -1L;
    private String name;
    private Integer age;

    public Customer(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
