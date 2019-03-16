package com.hendisantika.springbootrestapi.repository;

import com.hendisantika.springbootrestapi.entity.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.junit.Assert.assertEquals;


/**
 * Created by IntelliJ IDEA.
 * Project : springboot-rest-api
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-03-16
 * Time: 06:34
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class PersonRepositoryTest {
    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private PersonRepository personRepository;

    @Test
    public void repositorySavesPerson() {
        Person person = new Person();
        person.setName("Naruto");
        person.setAge(25);

        Person result = personRepository.save(person);

        assertEquals(result.getName(), "Naruto");
        assertEquals(result.getAge(), 25);

        // when
        Optional<Person> found = personRepository.findById(person.getId());

        // then
        assertThat(found.get().getName())
                .isEqualTo(person.getName());
    }

}