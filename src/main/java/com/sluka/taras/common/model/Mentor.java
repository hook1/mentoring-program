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
@DiscriminatorValue("mentorparticipant")
public class Mentor extends Participant {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User mentor;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "mentor")
    private Set<Mentee> mentee = new HashSet<>();
}
