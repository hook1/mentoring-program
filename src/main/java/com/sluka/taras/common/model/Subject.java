package com.sluka.taras.common.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by taras on 26.11.2016.
 */
@Data
@Entity
public class Subject extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "technology_id")
    private Technology technology;

    @ManyToOne
    @JoinColumn(name = "levelTechnology_id")
    private LevelTechnology levelTechnology;

    @OneToMany(mappedBy = "subject")
    private Set<Lecture> lectures = new HashSet<>();
}
