package com.azhar.codingchallengeswcinjava;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	// write a test to check if the application starts with arguments and expect exception

	@Test
	void testAppStartsWithArguments() throws Exception {
		DemoApplication.main(new String[] {"exitcode"});
	}

}
