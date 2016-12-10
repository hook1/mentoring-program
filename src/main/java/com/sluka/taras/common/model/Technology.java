package com.sluka.taras.common.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by taras on 08.11.2016.
 */
@Entity
@Data
public class Technology extends BaseEntity {
    private String name;

    @OneToMany(mappedBy = "level")
    private List<Subject> subjects = new ArrayList<>();

}
