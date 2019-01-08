package com.seadog.restapi;

import org.hamcrest.core.Is;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Arrays;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class MainControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void doublingTest() throws Exception {
        int number = 2;
        mockMvc.perform(
                MockMvcRequestBuilders.get("/doubling?input=" + number)
        )
                .andExpect(content().string("{" +
                        "\"received\":" + number + "," +
                        "\"result\":" + number * 2 +
                        "}"))
                .andExpect(MockMvcResultMatchers.status().isOk());

    }

    @Test
    public void AppendATest() throws Exception {
        String appendable = "word";
        mockMvc.perform(
                MockMvcRequestBuilders.get("/appenda/" + appendable)
                        .contentType(MediaType.APPLICATION_JSON)
        )
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(content().json(
                        "{ 'appended'   : '" + appendable + "a'  }"
                )).andDo(print());
    }

    @Test
    public void greeterTest() throws Exception {
        mockMvc.perform(
                MockMvcRequestBuilders.get("/greeter?name=Petike&title=student")
                        .contentType(MediaType.APPLICATION_JSON)
        )
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(content().json(
                        "{ 'welcome_message' : 'Oh, hi there Petike, my dear student!' }"
                ));
    }


    @Test
    public void untilTest() throws Exception {
        mockMvc.perform(
                MockMvcRequestBuilders.post("/dountil/sum")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"until\":\"5\"}")
        )
                .andDo(print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.result", Is.is(15)));

        mockMvc.perform(
                MockMvcRequestBuilders.post("/dountil/factor")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"until\":\"5\"}")
        )
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.result", Is.is(120)));

    }

    @Test
    public void arraysTestForSum() throws Exception {
        mockMvc.perform(
                MockMvcRequestBuilders.post("/arrays").
                        contentType(MediaType.APPLICATION_JSON).
                        content("{\"what\":\"sum\",\"numbers\":[1, 2, 5, 10]}")
        )
                .andDo(print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.result", Is.is(18)));
    }


    @Test
    public void arraysTestForMultiply() throws Exception {
        mockMvc.perform(
                MockMvcRequestBuilders.post("/arrays").
                        contentType(MediaType.APPLICATION_JSON).
                        content("{\"what\":\"multiply\",\"numbers\":[1, 2, 5, 10]}")
        )
                .andDo(print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.result", Is.is(100)));

    }

    @Test
    public void arraysTestForDouble() throws Exception {
        mockMvc.perform(
                MockMvcRequestBuilders.post("/arrays").
                        contentType(MediaType.APPLICATION_JSON).
                        content("{\"what\":\"double\",\"numbers\":[1, 2, 5, 10]}")
        )
                .andDo(print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.result", Is.is(Arrays.asList(2, 4, 10, 20))));

    }
}