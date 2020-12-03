package com.csvw.springsecurityoauth;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.authentication.AuthenticationManager;

@SpringBootTest
class SpringSecurityOauthApplicationTests {

	@Autowired
	private AuthenticationManager authenticationManager;

	@Test
	void encoderTest() {
		System.out.println(authenticationManager);
	}

}
