package com.example.demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;

import com.example.demo.entity.User;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@DisplayName("WEB-TEST")
public class AuthenticationWebTests {



    @LocalServerPort
    private int randomPort;
     
    @Autowired
    private TestRestTemplate template;

    @Test
    @DisplayName("('/')SERVER-RUNNING-TEST")
    void testForRunningServer1() {
    	String url ="http://localhost:"+randomPort+"/";
        ResponseEntity<String> response = template.getForEntity(url, String.class);
        assertEquals(200, response.getStatusCodeValue());
    }
    
    @Test
    @DisplayName("(list-users)SERVER-RUNNING-TEST")
    void testForRunningServer2() {
    	String url ="http://localhost:"+randomPort+"/users";
        ResponseEntity<String> response = template.getForEntity(url, String.class);
        assertEquals(200, response.getStatusCodeValue());
    }
    
//    @Test
//    @DisplayName("(/login)SERVER-RUNNING-TEST")
//    void testForRunningServer3() {
//    	String url ="http://localhost:"+randomPort+"/users";
//    	User user = new User("DemoTest", "test@gmail.com", "12345");
//    	HttpEntity<User> requestObj = new HttpEntity<>(user);
//        ResponseEntity<User> response = template.postForEntity(url,requestObj, User.class);
//        
//        assertEquals(200, response.getStatusCodeValue());
//        assertNotNull(response.getBody());
//        assertEquals("DemoTest", response.getBody().getName());
//    }
    
}
    
    