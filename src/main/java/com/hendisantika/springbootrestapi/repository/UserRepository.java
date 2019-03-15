package com.hendisantika.springbootrestapi.repository;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-rest-api
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-03-16
 * Time: 06:26
 */

import com.hendisantika.springbootrestapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Access to the user data. JpaRepository grants us convenient access methods here.
 */
public interface UserRepository extends JpaRepository<User, Long> {


    /**
     * Find a user by username
     *
     * @param username the user's username
     * @return user which contains the user with the given username or null.
     */
    User findOneByUsername(String username);

}