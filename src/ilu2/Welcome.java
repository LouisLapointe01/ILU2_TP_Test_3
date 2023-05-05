package ilu2;

public class Welcome {

    public static String welcome(String entree) {
    	  if (entree.isBlank()) {
              return "Hello, my friend";
          }

          String[] noms = entree.split(","); 
          
          if (noms.length == 1) {
              if (estEnMajuscules(noms[0].trim())) {
                  return "HELLO, " + noms[0].trim() + " !";
              } else {
                  return "Hello, " + capitaliserPremiereLettre(noms[0].trim());
              }
          }
          
          StringBuilder texte = new StringBuilder("Hello");
          StringBuilder texteMajuscule = new StringBuilder();
          
          for (String nom : noms) {
              if (estEnMajuscules(nom.trim())) {
                  if (texteMajuscule.length() == 0) {
                      texteMajuscule.append(", ");
                  } else {
                      texteMajuscule.append(", ");
                  }
                  texteMajuscule.append(nom.trim());
              } else {
                  texte.append(", ");
                  texte.append(capitaliserPremiereLettre(nom.trim()));
              }
          }

          if (texteMajuscule.length() > 0) {
              texte.append(". AND HELLO");
              texte.append(texteMajuscule.toString());
              texte.append(" !");
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
