package com.sluka.taras.common.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Created by taras on 24.11.2016.
 */
@Entity
@Data
public class Lecture extends BaseEntity {

    private String name;
    private String srcPathTheory;
    private String srcPathTask;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;

}
