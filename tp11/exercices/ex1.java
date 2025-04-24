package tp11.exercices;

import java.util.Scanner;

public class ex1 {
    public static double somme(double[] t, int n) {
        double s = 0;
        for (int i = 0; i < n; i++) {
            s = s + t[i];
        }
        return s;
    }

    public static void incre(double[] tab, int n, double v) {
        for (int i = 0; i < n; i++) {
            tab[i] = tab[i] + v;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = tp11.methodes.lectureUnEntierStrictPos();
        double[] t = new double[n];
        tp11.methodes.remplirNormaldouble(n, t);
        double s = tp11.methodes.lectureUnEntierNormal();
        System.out.println("la somme de tableau est: " + somme(t, n));
        incre(t, n, s);
        System.out.println("nouveau tableau:");
        for (int i = 0; i < t.length; i++) {
            System.out.println(+t[i]);
        }

    }

}
