package tp11;

import java.util.Scanner;

public class ex4 {

    public static int lectureN() {
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Entrez le nombre de lignes (n > 0) : ");
            n = sc.nextInt();
        } while (n <= 0);
        return n;
    }

    public static void RemplirTAb(int[][] M, int a, int b) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("M[" + i + "][" + j + "] = ");
                M[i][j] = sc.nextInt();
            }
        }
    }

    public static int CalculSomme(int[][] M, int i) {
        int somme = 0;
        for (int j = 0; j < M[i].length; j++) {
            somme += M[i][j];
        }
        return somme;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = lectureN();
        int n2 = lectureN();

        int[][] M = new int[n1][n2];

        RemplirTAb(M, n1, n2);

        for (int i = 0; i < n1; i++) {
            System.out.println("Somme de la ligne " + i + " : " + CalculSomme(M, i));
        }

        sc.close();
    }
}
