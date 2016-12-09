package com.sluka.taras.common.model;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by taras on 24.11.2016.
 */
@Entity
@Data
@DiscriminatorValue("menteeparticipant")
public class Mentee extends Participant {

    private User mentee;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mentor_id")
    private Mentor mentor;

}
