package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@SpringBootTest
class UserLoginAuthenticationApplicationTests {

	@Autowired
	UserRepository userRepository;
	
	@Test
	void contextLoads() {
	}

	@Test
	void test1() {
		Iterable<User> user = userRepository.findAll();
		int count = 0;
		for(User u : user) {
			count++;
		}
		assertNotEquals(count, 0);
	}
	
	@Test
	void test2() {
		Iterable<User> user = userRepository.findAll();
		int count = 0;
		int actualValue = 5;
		for(User u : user) {
			count++;
		}
		assertEquals(count, actualValue);
	}
	@Test
	void test3() {
		Iterable<User> users = userRepository.findAll();
		
		for(User u: users)
			assertNotNull(u);
	}
	
	
}
