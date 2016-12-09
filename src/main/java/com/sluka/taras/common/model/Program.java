package com.sluka.taras.common.model;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by taras on 24.11.2016.
 */
@Entity
@Data
public class Program extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "programLevel_id")
    private ProgramLevel programLevel;

    @ManyToMany
    @JoinTable(name = "program_subject", joinColumns = @JoinColumn(name = "program_id"), inverseJoinColumns = @JoinColumn(name = "subject_id"))
    private Set<Subject> subjects = new HashSet<>();


}
