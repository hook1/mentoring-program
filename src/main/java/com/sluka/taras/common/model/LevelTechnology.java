package com.sluka.taras.common.model;

import lombok.Data;

import javax.persistence.Entity;

/**
 * Created by taras on 08.11.2016.
 */
/*L1("Володієте теоретичними знаннями"),
    L2("Володієте практичними навичками"),
    L3("Маєте досвід більше 3 років"),
    L4("Закінчили хоча би 2 серйозних проекти з основними вимогами до цього навику");*/
@Entity
@Data
public class LevelTechnology extends BaseEntity {
    private String name;
    private String description;
/*    @OneToMany(mappedBy = "levelTechnology")
    private List<Subject> subjects = new ArrayList<>();*/


   /* private Technology technology;*/


}
