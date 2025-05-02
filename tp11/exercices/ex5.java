package tp11.exercices;

import java.util.Scanner;

public class ex5 {
    public static void affiche(double[][] t) {
        for (double[] ligne : t) {
            for (double valeur : ligne) {
                System.out.print(valeur + " ");
            }
            System.out.println();
        }
    }

    public static void affiche(double[] ligne) {
        for (double valeur : ligne) {
            System.out.print(valeur + " ");
        }
        System.out.println();
    }

    public static boolean regulier(double[][] t) {
        if (t.length == 0)
            return true;
        int taille = t[0].length;
        for (int i = 1; i < t.length; i++) {
            if (t[i].length != taille)
                return false;
        }
        return true;
    }

    public static double[] sommeLignes(double[][] t) {
        double[] resultats = new double[t.length];
        for (int i = 0; i < t.length; i++) {
            double somme = 0;
            for (double val : t[i]) {
                somme += val;
            }
            resultats[i] = somme;
        }
        return resultats;
    }

    public static double[][] somme(double[][] t1, double[][] t2) {
        if (!regulier(t1) || !regulier(t2))
            return null;
        if (t1.length != t2.length || t1[0].length != t2[0].length)
            return null;

        double[][] resultat = new double[t1.length][t1[0].length];
        for (int i = 0; i < t1.length; i++) {
            for (int j = 0; j < t1[i].length; j++) {
                resultat[i][j] = t1[i][j] + t2[i][j];
            }
        }
        return resultat;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez le nombre de lignes pour les tableaux:");
        int lignes = scanner.nextInt();
        System.out.println("Entrez le nombre de colonnes pour les tableaux:");
        int colonnes = scanner.nextInt();

        double[][] tab1 = new double[lignes][colonnes];
        double[][] tab2 = new double[lignes][colonnes];

        System.out.println("Saisie du tableau 1:");
        for (int i = 0; i < lignes; i++) {
            for (int j = 0; j < colonnes; j++) {
                System.out.printf("Entrez la valeur pour tab1[%d][%d]: ", i, j);
                tab1[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("Saisie du tableau 2:");
        for (int i = 0; i < lignes; i++) {
            for (int j = 0; j < colonnes; j++) {
                System.out.printf("Entrez la valeur pour tab2[%d][%d]: ", i, j);
                tab2[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("Tableau 1 :");
        affiche(tab1);

        System.out.println("Tableau 2 :");
        affiche(tab2);

        System.out.println("Sommes des lignes de tab1 :");
        affiche(sommeLignes(tab1));

        System.out.println("Tableau 1 est régulier ? " + regulier(tab1));
        System.out.println("Somme de tab1 et tab2 :");
        double[][] somme = somme(tab1, tab2);
        if (somme != null) {
            affiche(somme);
        } else {
            System.out.println("Somme impossible : tableaux irréguliers ou de dimensions différentes.");
        }

        scanner.close();
    }
}