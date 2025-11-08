package com.example.springbootapp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.hamcrest.Matchers.containsString;

@WebMvcTest(WelcomeController.class)
class WelcomeControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void testWelcomeEndpoint() throws Exception {
		mockMvc.perform(get("/welcome"))
				.andExpect(status().isOk())
				.andExpect(content().string(containsString("Welcome to Spring Boot REST Application")));
	}

}
