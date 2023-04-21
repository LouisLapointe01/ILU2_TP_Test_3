package ilu2;

public class Welcome {

	public static String welcome(String nom) {
		nom = nom.substring(0,1).toUpperCase()+nom.substring(1);
		return "Hello, " + nom;
 	}
}
