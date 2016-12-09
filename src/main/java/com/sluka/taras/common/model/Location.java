package com.sluka.taras.common.model;

import lombok.Data;

import javax.persistence.Entity;

/**
 * Created by taras on 07.11.2016.
 */
@Entity
@Data
public class Location extends BaseEntity {
    private String country;
    private String region;
    private String area;
    private String city;
    private String streat;
    private int building;
    private String building_addidationaly;
    private int level;
    private int offise;

  /*  @OneToOne(fetch = FetchType.LAZY, mappedBy = "location")
    private UserDetail userDetail;*/
}
