package ilu2;

public class Welcome {

	public static String welcome(String input) {
		if (input.isBlank()) {return "Hello, my friend";} //verif chaine vide
		
		StringBuilder texte = new StringBuilder("Hello, ");
		
		texte.append(input.substring(0, 1).toUpperCase());
		texte.append(input.substring(1));
		
		return texte.toString();
	}
}
