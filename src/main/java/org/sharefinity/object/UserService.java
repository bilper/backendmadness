package org.sharefinity.object;


import org.sharefinity.entity.User;

public interface UserService {
    User findByUsername(String username);

    User save(UserDto userDto);

}