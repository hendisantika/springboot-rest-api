package com.hendisantika.springbootrestapi.service;

import com.hendisantika.springbootrestapi.entity.Person;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-rest-api
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-03-16
 * Time: 06:24
 */
public interface BuddyService {
    Person findBuddy(Person person);
}
