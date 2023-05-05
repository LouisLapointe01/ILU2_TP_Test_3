package ilu2;

public class Welcome {

	public static String welcome(String input) {
		
		StringBuilder texte = new StringBuilder("Hello, ");
		
		if (input.isBlank()) {return "Hello, my friend";}
		texte.append(input);
		if (input.toUpperCase().equals(input)){
		   texte.append(" !");
		   return texte.toString().toUpperCase();
		}
	
		return texte.toString();
	}
}