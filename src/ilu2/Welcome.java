package ilu2;

public class Welcome {

    public static String welcome(String entree) {
    	  if (entree.isBlank()) {
              return "Hello, my friend";
          }

          String[] noms = entree.split(",");

          StringBuilder texte = new StringBuilder("Hello");

          for (String nom : noms) {
              if (estEnMajuscules(nom)) {
                  texte.append(", ");
                  texte.append(nom.toUpperCase());
              } else {
                  texte.append(", ");
                  texte.append(capitaliserPremiereLettre(nom));
              }
          }

          if (noms.length == 1 && estEnMajuscules(entree)) {
              StringBuilder textemaj = new StringBuilder("HELLO, ");
              textemaj.append(entree);
              textemaj.append(" !");
              return textemaj.toString();
          }

          return texte.toString();
      
    }

    public static String capitaliserPremiereLettre(String mot) {
        return mot.substring(0, 1).toUpperCase() + mot.substring(1).toLowerCase();
    }

    public static boolean estEnMajuscules(String entree) {
        for (int i = 0; i < entree.length(); i++) {
            char caractere = entree.charAt(i);

            if (Character.isLetter(caractere) && !Character.isUpperCase(caractere)) {
                return false;
            }
        }
        return true;
    }
}
