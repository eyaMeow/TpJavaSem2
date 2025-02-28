import java.util.Scanner;

public class tp7ex2 {
    public static void main(String[] args) {
        int[][] m = new int[30][30];
        int nl, nc;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("donner nl");
            nl = sc.nextInt();
        } while (nl < 0 && nl > 30);
        do {
            System.out.println("donner nc");
            nc = sc.nextInt();
        } while (nl < 0 && nc > 30);
        for (int i = 0; i < nl; i++) {
            for (int j = 0; j < nc; j++) {
                System.out.println("m[" + i + "," + j + "]=");
                m[i][j] = sc.nextInt();
            }
        }
        int somme = 0, pr = 1;
        float moy;
        sc.close();
        for (int i = 0; i < nl; i++) {
            for (int j = 0; j < nc; j++) {
                somme = somme + m[i][j];
                pr = pr * m[i][j];
            }
        }
        moy = (float) somme / (nl * nc);
        System.out.println("somme: " + somme + " moyenne: " + moy + " produit: " + pr);

    }
}
