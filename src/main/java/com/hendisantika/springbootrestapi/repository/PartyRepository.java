package com.hendisantika.springbootrestapi.repository;

import com.hendisantika.springbootrestapi.entity.Party;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-rest-api
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-03-15
 * Time: 07:15
 */
@Repository
public interface PartyRepository extends CrudRepository<Party, Long> {
    Collection<Party> findAll();
}
