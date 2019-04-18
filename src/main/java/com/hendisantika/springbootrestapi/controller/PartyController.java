package com.hendisantika.springbootrestapi.controller;

import com.hendisantika.springbootrestapi.entity.Party;
import com.hendisantika.springbootrestapi.repository.PartyRepository;
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
 * Time: 07:16
 */
@RestController
@RequestMapping("/parties")
public class PartyController {

    @Autowired
    private PartyRepository partyRepo;

    @GetMapping
    public ResponseEntity<Collection<Party>> getParties() {
        return new ResponseEntity<>(partyRepo.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Party> getParty(@PathVariable long id) {
        Optional<Party> party = partyRepo.findById(id);

        return getPartyResponseEntity(id, party);
    }

    private ResponseEntity<Party> getPartyResponseEntity(@PathVariable long id, Optional<Party> party) {
        if (party.isPresent()) {
            return new ResponseEntity<>(partyRepo.findById(id).get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<?> addParty(@RequestBody Party party) {
        return new ResponseEntity<>(partyRepo.save(party), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePartyn(@PathVariable long id) {
        partyRepo.deleteById(id);

        return new ResponseEntity<Void>(HttpStatus.OK);
    }
}

