package com.hendisantika.springbootrestapi.controller;

import com.hendisantika.springbootrestapi.entity.Party;
import com.hendisantika.springbootrestapi.entity.Person;
import com.hendisantika.springbootrestapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-rest-api
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-03-15
 * Time: 06:38
 */
@RestController
@RequestMapping("/people")
public class PersonController {

    @Autowired
    private PersonRepository personRepo;

    @GetMapping
    public ResponseEntity<Collection<Person>> getPeople() {
        return new ResponseEntity<>(personRepo.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Person> getPerson(@PathVariable long id) {
        Optional<Person> person = personRepo.findById(id);

        if (person != null) {
            return new ResponseEntity<>(personRepo.findById(id).get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<?> addPerson(@RequestBody Person person) {
        return new ResponseEntity<>(personRepo.save(person), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePerson(@PathVariable long id) {
        personRepo.deleteById(id);

        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @GetMapping("/{id}/parties")
    public ResponseEntity<Collection<Party>> getPersonParties(@PathVariable long id) {
        Optional<Person> person = personRepo.findById(id);

        if (person != null) {
            return new ResponseEntity<>(person.get().getParties(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

}
