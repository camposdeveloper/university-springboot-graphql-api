package com.camposdeveloper.university;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class UniversitySpringbootGraphqlApplicationTests {

	@Test
	public void contextLoads() {
		
		String msg = "GraphQL!";
		assertEquals("Erro!", "GraphQL!", msg);
		
	}

}
