package com.hendisantika.springbootrestapi.repository;

import com.hendisantika.springbootrestapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-rest-api
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-03-15
 * Time: 06:39
 */
public interface PersonRepository extends JpaRepository<Person, Long> {
}
