package TP8;

public class exemple {
    public static void main(String[] args) {
        // Déclaration de chaînes de caractères
        String ch1 = "coucou";
        String ch2 = new String("c'est moi!\n");
        String ch3 = ch1 + ch2;

        // Affichage de la chaîne résultante
        System.out.println(ch3);

        // Affichage de la longueur de ch1
        System.out.println("longueur de ch1: " + ch1.length());

        // Affichage du caractère à la position 2 dans ch1
        System.out.println("caractere en pos 2: " + ch1.charAt(2));

        // Comparaison de ch1 avec "coucou" (même valeur)
        System.out.println(ch1.equals("coucou"));

        // Comparaison de ch1 avec ch2 (chaînes différentes)
        System.out.println(ch1.equals(ch2));

        // Recherche de la position de 'o' dans ch1
        System.out.println("position de o dans ch1: " + ch1.indexOf('o'));

        // Recherche de la position de "cou" dans ch1
        System.out.println("position de 'cou' dans ch1: " + ch1.indexOf("cou"));

        // Recherche de la position de "moi" dans ch1
        System.out.println("position de 'moi' dans ch1: " + ch1.indexOf("moi"));

        // Conversion de ch1 en majuscules
        System.out.println("ch1 en majus: " + ch1.toUpperCase());

        // Conversion de ch1 en minuscules
        System.out.println("ch1 en minus: " + ch1.toLowerCase());
    }
}
