package com.hendisantika.springbootrestapi.controller;

import com.hendisantika.springbootrestapi.entity.Party;
import com.hendisantika.springbootrestapi.repository.PartyRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Optional;

import static org.hamcrest.Matchers.is;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-rest-api
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-04-18
 * Time: 07:13
 */
@RunWith(SpringRunner.class)
@WebMvcTest(value = PartyController.class, secure = false)
public class PartyControllerTest {
    @Autowired
    private MockMvc mvc;

    @MockBean
    private PartyRepository partyRepo;

    private Party party;

    @Before
    public void prepare() {
        party = new Party();
        party.setId(1l);
        party.setLocation("Transmart Buahbatu");
    }

    @Test
    public void getPartyTest() throws Exception {
        given(partyRepo.findById(1l)).willReturn(Optional.of(party));
        mvc.perform(get("/parties/1").accept(MediaType.APPLICATION_JSON_VALUE)).andExpect(status().isOk())
                .andExpect(jsonPath("$.id", is(1)))
                .andExpect(jsonPath("$.location", is("Transmart Buahbatu")));
    }

    @Test
    public void partyNotFoundTest() throws Exception {
        mvc.perform(get("/parties/2").accept(MediaType.APPLICATION_JSON_VALUE)).andExpect(status().isNotFound());
    }
}