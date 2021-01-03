package com.example.javaperfdemo.api;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

/**
 * Created by Azeem on 1/3/21.
 */

@SpringBootTest
@AutoConfigureMockMvc
class HeartbeatControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    void getHeartBeat() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/heartbeat/").accept(MediaType.APPLICATION_JSON))
            .andExpect(status().isGone());
    }
}