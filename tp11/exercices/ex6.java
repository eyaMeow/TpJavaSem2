package tp11.exercices;

import java.util.Scanner;

public class ex6 {
    public static int maxTableau(int[] tableau) {
        if (tableau.length == 0) {
            throw new IllegalArgumentException("Un tableau vide n'a pas de maximum.");
        }

        int max = tableau[0];
        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i] > max) {
                max = tableau[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez la taille du tableau:");
        int taille = scanner.nextInt();
        int[] t = new int[taille];

        System.out.println("Entrez les éléments du tableau:");
        for (int i = 0; i < taille; i++) {
            System.out.printf("Element %d: ", i);
            t[i] = scanner.nextInt();
        }

        try {
            System.out.println("Maximum du tableau : " + maxTableau(t));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}