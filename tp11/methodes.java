package tp11;

import java.util.Scanner;

public class methodes {
    public static int lectureUnEntierStrictPos() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Donner un entier strictement positif : ");
            while (!sc.hasNextInt()) {
                System.out.print("Ce n'est pas un entier. Réessayez : ");
                sc.next();
            }
            n = sc.nextInt();
        } while (n < 0);
        return n;
    }

    public static void remplirNormal(int n, int[] t) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("donner entier numero" + i);
            t[i] = sc.nextInt();
        }
    }

    public static void remplacerUnEntierAvecAnother(int x1, int x2, int n, int[] t) {
        for (int i = 0; i < t.length; i++) {
            if (t[i] == x1) {
                t[i] = x2;
            }
        }
    }

    public static void affiche(int[] t, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(t[i]);
        }
    }

    public static int lectureUnEntierNormal() {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Donner un entier: ");
        while (!sc.hasNextInt()) {
            System.out.print("Ce n'est pas un entier. Réessayez : ");
            sc.next();
        }
        n = sc.nextInt();
        return n;
    }

    public static void remplirDesNotes(int n, int[] t) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= n; i++) {
            do {
                System.out.print("Donner le note" + i);
                while (!sc.hasNextInt()) {
                    System.out.print("Ce n'est pas un entier. Réessayez : ");
                    sc.next();
                }
                t[i] = sc.nextInt();
            } while (n < 0 || n > 20);
        }
    }

    public static void remplirDesEntierPos(int n, int[] t) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= n; i++) {
            do {
                System.out.print("Donner le note" + i);
                while (!sc.hasNextInt()) {
                    System.out.print("Ce n'est pas un entier. Réessayez : ");
                    sc.next();
                }
                t[i] = sc.nextInt();
            } while (n < 0);
        }
    }

    public static float calculmoy(int[] t, int n) {
        float moy;
        int sum;
        sum = 0;
        for (int i = 0; i < t.length; i++) {
            sum = sum + t[i];
        }
        return moy = (float) sum / n;
    }

    public static int countNbPlusMoy(int[] t, int n) {
        int s = 0;
        for (int i = 0; i < t.length; i++) {
            if (t[i] > calculmoy(t, n)) {
                s = s + 1;
            }
        }
        return s;
    }

    public static int lectureSupDis() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Donner un entier strictement positif : ");
            while (!sc.hasNextInt()) {
                System.out.print("Ce n'est pas un entier. Réessayez : ");
                sc.next();
            }
            n = sc.nextInt();
        } while (n < 10);
        return n;
    }

    public static void remplirNormaldouble(int n, double[] t) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("donner numero reel " + i + " : ");
            while (!sc.hasNextDouble()) {
                System.out.print("Ce n'est pas un reel. Réessayez : ");
                sc.next();
            }
            t[i] = sc.nextDouble();

        }
    }
}
