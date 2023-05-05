package ilu2;

public class Welcome {

    public static String welcome(String entree) {
        if (entree.isBlank()) {
            return "Hello, my friend"; //verif chaine vide
        }

        String[] noms = entree.split(","); // Sépare les noms en utilisant la virgule comme séparateur

        if (noms.length == 2) {
            return "Hello, " + capitaliserPremiereLettre(noms[0]) + ", " + capitaliserPremiereLettre(noms[1]);
        }

        StringBuilder texte = new StringBuilder("Hello, ");

        texte.append(capitaliserPremiereLettre(entree));

        if (estEnMajuscules(entree)) {
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
