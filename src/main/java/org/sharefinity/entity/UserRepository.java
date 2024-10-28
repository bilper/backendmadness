package org.sharefinity.entity;

import org.sharefinity.object.UserDto;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

    User save(UserDto userDto);
}
