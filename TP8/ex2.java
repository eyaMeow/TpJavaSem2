package TP8;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        // Déclaration des variables
        String ch; // Chaîne d'entrée de l'utilisateur
        StringBuffer newch = new StringBuffer(); // StringBuffer pour construire la nouvelle chaîne modifiée
        int a; // Variable pour stocker le code ASCII modifié de chaque caractère
        Scanner sc = new Scanner(System.in);

        // Demander une chaîne ne dépassant pas 30 caractères et la convertir en
        // minuscules
        do {
            System.out.println("donner une chaine ne depasse pas 30 cara");
            ch = sc.nextLine();
            ch = ch.toLowerCase(); // Convertir la chaîne en minuscules
        } while (ch.length() > 30);

        // Parcourir chaque caractère de la chaîne
        for (int i = 0; i < ch.length(); i++) {
            a = (int) ch.charAt(i) + 3; // Ajouter 3 au code ASCII du caractère actuel

            // Vérifier si le code ASCII dépasse 'z' (code 122)
            if (a > 122) {
                a = 97 + 2; // Si c'est le cas, recommencer à partir de 'a' (code 97) et ajouter 2 pour
                            // obtenir 'c'
            }

            // Ajouter le caractère modifié au StringBuffer
            newch.append((char) a);
        }

        // Afficher la nouvelle chaîne modifiée
        System.out.println("La nouvelle chaine est: " + newch.toString());

        sc.close();
    }
}
