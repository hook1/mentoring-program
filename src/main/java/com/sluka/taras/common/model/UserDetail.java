package com.sluka.taras.common.model;

import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

/**
 * Created by taras on 07.11.2016.
 */

@Data
@Embeddable
public class UserDetail {
    @Embedded
    ContactDetail contactDetail;

    @ManyToOne
    @JoinColumn(name = "level_id")
    private Level level;
    private Date birthday;
    private String img;
    /*@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "contactDetail_id")
    private ContactDetail contactDetail;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "location_id")
    private Location location;*/


}
