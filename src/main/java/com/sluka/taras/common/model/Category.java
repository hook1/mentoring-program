package com.sluka.taras.common.model;

import lombok.Data;

import javax.persistence.Entity;

/**
 * Created by taras on 08.11.2016.
 */
@Entity
@Data
public class Category extends BaseEntity {

    private String name;

    /*@OneToMany(mappedBy = "category")
    private Set<Technology> technologyList = new HashSet<>();*/

}
