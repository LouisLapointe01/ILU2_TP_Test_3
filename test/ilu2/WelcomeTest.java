package ilu2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WelcomeTest {
	
	@Test
	void EX1() {
		String expected = "Hello, Bob";
		Welcome.welcome("bob");
		assertEquals(expected,Welcome.welcome("bob"));

	}
	
	@Test
	void EX2() {
		String expected = "Hello, my friend";
		assertEquals(Welcome.welcome("   "),expected);
		assertEquals(Welcome.welcome(""),expected);
		assertEquals(Welcome.welcome(" "),expected);
		assertEquals(Welcome.welcome("  "),expected);

	}
	@Test
	void EX3() {
		assertEquals(Welcome.welcome("MICHEL"),"HELLO, MICHEL !");
	}

	@Test
	void EX4() {
		assertEquals(Welcome.welcome("michel,boby"), "Hello, Michel, Boby");
	}
	
	@Test
	void EX5() {
	      assertEquals(Welcome.welcome("michel,boby,jerry"),"Hello, Michel, Boby, Jerry");

	}
	
	@Test
    void EX6() {
        assertEquals(Welcome.welcome("Amy, BOB, Jerry"), "Hello, Amy, Jerry. AND HELLO, BOB !");
  
    }
	
	@Test
	void EX8() {
		assertEquals(Welcome.welcome("Amy, BOB      , Jerry"), "Hello, Amy, Jerry. AND HELLO, BOB !");
		assertEquals(Welcome.welcome("michel,         boby,        jerry"),"Hello, Michel, Boby, Jerry");
		assertEquals(Welcome.welcome("michel,       boby"), "Hello, Michel, Boby");
	}
	
}
