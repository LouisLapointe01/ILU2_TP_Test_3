package ilu2;

public class Welcome {

	public static String welcome(String input) {
		if (input.isBlank()) {return "Hello, my friend";} //verif chaine vide
		
		StringBuilder texte = new StringBuilder("Hello, ");
		
		texte.append(input.substring(0, 1).toUpperCase());
		texte.append(input.substring(1));
		
		if(estEnMajuscules(input)){
			StringBuilder textemaj = new StringBuilder("HELLO, ");
			textemaj.append(input);
			textemaj.append(" !");
			return textemaj.toString();
		}
		return texte.toString();
		
	}
	
	public static boolean estEnMajuscules(String input) {
        for (int i = 0; i < input.length(); i++) {
            char caractere = input.charAt(i);

            if (Character.isLetter(caractere) && !Character.isUpperCase(caractere)) {
                return false;
            }
        }
        return true;
    }
}
