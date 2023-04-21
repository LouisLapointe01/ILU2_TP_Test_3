package ilu2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WelcomeTest {
	
	void EX1() {
		System.out.println("Initialisation...");
		String expected = "Hello, Bob";
		Welcome.welcome("bob");
		assertEquals(expected,Welcome.welcome("bob"));
		
	}
	@Test
	void test() {
		
	}

}
