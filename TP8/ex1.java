package TP8;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        // Déclaration des variables pour les mots et le texte
        String mot1, mot2;
        StringBuffer texte;
        int a, b;

        Scanner sc = new Scanner(System.in);

        // Demander à l'utilisateur de saisir un texte
        System.out.println("Saisir un texte");
        texte = new StringBuffer(sc.nextLine());

        // Demander à l'utilisateur de saisir le mot1
        System.out.println("Donner mot1");
        mot1 = sc.next();

        // Demander à l'utilisateur de saisir le mot2
        System.out.println("Donner mot2");
        mot2 = sc.next();

        // Vérifier si mot1 existe dans le texte
        if (texte.indexOf(mot1) == -1) {
            // Si mot1 n'existe pas, afficher un message d'erreur
            System.out.println("mot1 n'existe pas dans le texte");
        } else {
            // Si mot1 existe, récupérer l'indice du premier caractère de mot1 dans le texte
            a = texte.indexOf(mot1);
            // Calculer la position de la fin de mot1
            b = a + mot1.length();

            // Remplacer mot1 par mot2 dans le texte
            texte.replace(a, b, mot2);

            // Afficher le texte modifié
            System.out.println("New phrase: " + texte);
        }

        sc.close();
    }
}
