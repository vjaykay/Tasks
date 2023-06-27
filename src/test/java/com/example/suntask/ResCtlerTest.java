package com.example.suntask;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.Matchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class ResCtlerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testNumbersEndpoint_Addition() throws Exception {
        mockMvc.perform(post("/add/5/3/+")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.input1", is(5)))
                .andExpect(jsonPath("$.input2", is(3)))
                .andExpect(jsonPath("$.result", is(8)));
    }

    @Test
    public void testNumbersEndpoint_Subtraction() throws Exception {
        mockMvc.perform(post("/add/10/3/-")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.input1", is(10)))
                .andExpect(jsonPath("$.input2", is(3)))
                .andExpect(jsonPath("$.result", is(7)));
    }

    // Add more test cases for different scenarios, error conditions, etc.

}
