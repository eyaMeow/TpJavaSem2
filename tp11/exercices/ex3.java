package tp11.exercices;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        System.out.println("donner un entier:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] t = new int[n];
        remplir(t);
        System.out.println("tableau initial ");
        affich(t);
        System.out.println("");
        tri(t);
        System.out.println("tableau triee");
        affich(t);
    }

    public static void remplir(int[] t) {
        Scanner sc = new Scanner(System.in);
        System.out.println("donner: ");
        for (int i = 0; i < t.length; i++) {
            t[i] = sc.nextInt();
        }
    }

    public static void tri(int[] t) {
        int aux;
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t.length; j++) {
                if (t[i] > t[j]) {
                    aux = t[i];
                    t[i] = t[j];
                    t[j] = aux;
                }
            }
        }
    }

    public static void affich(int[] t) {
        for (int i = 0; i < t.length; i++) {
            System.out.println(t[i]);
        }
    }
}
