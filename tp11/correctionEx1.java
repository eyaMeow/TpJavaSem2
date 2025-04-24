package tp11;

import java.util.Scanner;

public class correctionEx1 {
    public static void main(String[] args) {
        int n, x1, x2;
        int[] t = new int[100];
        n = tp11.methodes.lectureUnEntierStrictPos();
        tp11.methodes.remplirNormal(n, t);
        x1 = tp11.methodes.lectureUnEntierNormal();
        x2 = tp11.methodes.lectureUnEntierNormal();
        tp11.methodes.remplacerUnEntierAvecAnother(x1, x2, n, t);
        tp11.methodes.affiche(t, n);
    }
}
