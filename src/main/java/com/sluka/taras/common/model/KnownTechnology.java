package com.sluka.taras.common.model;

import lombok.Data;

import javax.persistence.Entity;

/**
 * Created by taras on 08.11.2016.
 */
@Entity
@Data
public class KnownTechnology extends BaseEntity {

    /*@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "levelTechnology_id")
    private LevelTechnology levelTechnology;
    @ManyToOne
    private Technology technology;*/

   /* @ManyToOne
    private User user;*/
}
