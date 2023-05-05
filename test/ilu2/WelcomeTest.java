package ilu2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WelcomeTest {
	
	
	@Test
	void EX3() {
		assertEquals(Welcome.welcome("MICHEL"), "HELLO, MICHEL !");
		assertEquals(Welcome.welcome("42"), "HELLO, 42 !");
		assertEquals(Welcome.welcome("Michel"), "Hello, Michel");
	}

}
