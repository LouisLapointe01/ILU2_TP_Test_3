package ilu2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WelcomeTest {
	
	@Test
	void EX1() {
		System.out.println("Initialisation...");
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
		String expected = "HELLO, MICHEL !";
		assertEquals(Welcome.welcome("MICHEL"),expected);
	}

	@Test
	void EX4() {
		assertEquals(Welcome.welcome("michel,boby"), "Hello, Michel, Boby");
	}
	
	@Test
	void EX5() {
		  String expected1 = "Hello, Michel, Boby, Jerry";
	      assertEquals(Welcome.welcome("michel,boby,jerry"), expected1);

	}
}
