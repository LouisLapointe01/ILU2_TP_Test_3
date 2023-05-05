package ilu2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WelcomeTest {
	
	
	@Test
	void EX2() {
		String expected = "Hello, my friend";
		assertEquals(Welcome.welcome(""),expected);
		assertEquals(Welcome.welcome(" "),expected);
		assertEquals(Welcome.welcome("  "),expected);
		
	}

}
