package TP8;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Déclaration de variables : 'ch' pour le verbe entré par l'utilisateur,
        // 'newch' pour la base du verbe sans 'er'
        String ch, newch;

        // Tableau contenant les terminaisons des conjugaisons au présent pour les
        // verbes du 1er groupe
        String[] t = { "e", "es", "e", "ons", "ez", "ent" };

        // Demande à l'utilisateur de saisir un verbe du 1er groupe tant que ce verbe
        // n'est pas valide
        do {
            System.out.println("donner un verbe de 1ere groupe");
            ch = sc.nextLine(); // Lecture de l'entrée utilisateur
        } while (!ch.endsWith("er") || ch.equals("aller")); // Vérifie que le verbe se termine par 'er' et n'est pas
                                                            // 'aller'

        // Récupère la base du verbe sans 'er'
        newch = ch.substring(0, ch.length() - 2);

        // Affiche les conjugaisons pour "je", "tu", et "il/elle" avec la base du verbe
        System.out.println("je " + newch + t[0]);
        System.out.println("tu " + newch + t[1]);
        System.out.println("il/elle " + newch + t[2]);

        // Cas particulier pour les verbes qui se terminent par 'g'
        if (newch.endsWith("g")) {
            System.out.println("nous " + newch + "e" + t[3]);
        }

        // Cas particulier pour les verbes qui se terminent par 'c'
        if (newch.endsWith("c")) {
            String newch1 = ch.substring(0, ch.length() - 3); // Récupère la base du verbe sans "cer"
            System.out.println("nous " + newch1 + "ç" + t[3]);
        }

        // Conjugaison pour "vous" et "ils/elles" en utilisant la base sans modification
        System.out.println("vous " + newch + t[4]);
        System.out.println("ils/elles " + newch + t[5]);
    }
}
