package TP8;

import java.util.Scanner;

public class exerciceDeClass {
    public static void main(String[] args) {
        // Déclaration des variables pour les mots et le texte
        String mot1, mot2, texte, t2;

        Scanner sc = new Scanner(System.in);

        // Demander à l'utilisateur de saisir un texte
        System.out.println("saisir un texte");
        texte = sc.nextLine();

        // Demander à l'utilisateur de saisir mot1
        System.out.println("donner mot1");
        mot1 = sc.next();

        // Demander à l'utilisateur de saisir mot2
        System.out.println("donner mot2");
        mot2 = sc.next();

        // Vérifier si mot1 existe dans le texte
        if (texte.indexOf(mot1) == -1) {
            // Si mot1 n'existe pas dans le texte, afficher un message d'erreur
            System.out.println("mot1 n'existe pas dans le texte");
        } else {
            // Si mot1 existe, remplacer toutes les occurrences de mot1 par mot2
            t2 = texte.replace(mot1, mot2);

            // Afficher la nouvelle phrase après remplacement
            System.out.println("new phrase: " + t2);
        }

        sc.close();
    }
}
