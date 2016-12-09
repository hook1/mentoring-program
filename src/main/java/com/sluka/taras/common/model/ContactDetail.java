package com.sluka.taras.common.model;

import lombok.Data;

import javax.persistence.Embeddable;


/**
 * Created by taras on 07.11.2016.
 */
//@Table(name = "contact_detai")

@Data
@Embeddable
public class ContactDetail {
    private String phoneNumber;     //+380-XX-XXX-XX-X
    private String homeNumber;      //+380-XX-XXX-XX-XX     (Львів код 32)
    private String workNumber;      //+380-XX-XXX-XX-XX.    (Львів код 32)
    private String skype;
}
