package com.sluka.taras.common.mapper;

import com.sluka.taras.common.dto.UserDto;
import com.sluka.taras.common.model.User;
import org.springframework.stereotype.Component;

/**
 * Created by taras on 10.12.2016.
 */
@Component
public class UserMapper implements GenericMapper<User, UserDto> {

    @Override
    public UserDto toDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        userDto.setEmail(user.getEmail());
        userDto.setPassword(user.getPassword());
        return userDto;
    }

    @Override
    public User toEntity(UserDto userDto) {
        User user = new User();
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setPassword(userDto.getPassword());
        user.setEmail(userDto.getEmail());
        return user;
    }
}
