package com.hendisantika.springbootrestapi.controller;

import com.hendisantika.springbootrestapi.entity.Party;
import com.hendisantika.springbootrestapi.repository.PartyRepository;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

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

}