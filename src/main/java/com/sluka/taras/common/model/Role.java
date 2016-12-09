package com.sluka.taras.common.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Data
public class Role extends BaseEntity {
    @Column(unique = true)
    private String name;
}
