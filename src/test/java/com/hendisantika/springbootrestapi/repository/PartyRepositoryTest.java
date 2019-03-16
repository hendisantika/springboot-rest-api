package com.hendisantika.springbootrestapi.repository;

import com.hendisantika.springbootrestapi.entity.Party;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-rest-api
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-03-16
 * Time: 07:15
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class PartyRepositoryTest {

    @Autowired
    private PartyRepository repository;

    @Test
    public void repositorySavesParty() {
        Party party = new Party();
        party.setLocation("Konohagakure");

        Party result = repository.save(party);

        assertEquals(result.getLocation(), "Konohagakure");
    }

}