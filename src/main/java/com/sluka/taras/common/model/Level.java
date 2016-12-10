package com.sluka.taras.common.model;

import lombok.Data;

import javax.persistence.Entity;

/**
 * Created by taras on 24.11.2016.
 */
@Entity
@Data
public class Level extends BaseEntity {
    String name;
    String description;
}
