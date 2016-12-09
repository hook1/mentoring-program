package com.sluka.taras.web.controller.registration;

import lombok.Data;

/**
 * Created by taras on 27.11.2016.
 */
@Data
public class RegistrationForm {
    private String firstName;
    private String lastName;
    private String username;
        private String email;
    private String password;
    /*private Date birthDay;*/

}
