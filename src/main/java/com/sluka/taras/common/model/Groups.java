package com.sluka.taras.common.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by taras on 24.11.2016.
 */
@Entity
@Data
public class Groups extends BaseEntity {
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User curarot;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "groups")
    private List<Participant> participants = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "program_group", joinColumns = @JoinColumn(name = "program_id"), inverseJoinColumns = @JoinColumn(name = "group_id"))
    private Set<Program> programs = new HashSet<>();


}
