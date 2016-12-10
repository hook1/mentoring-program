package com.sluka.taras.common.dto;

import com.sluka.taras.common.model.enums.Sex;
import lombok.Data;

/**
 * Created by taras on 10.12.2016.
 */
@Data
public class UserDto extends BaseDto {
    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String password;
    private Sex sex;
}
