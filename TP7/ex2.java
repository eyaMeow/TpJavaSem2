import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        int[][] m = new int[30][30]; // declaration de matrice d'entier avec 30x30 taille max
        int nl, nc; // nl: nombre de ligne nc: nombre colone de matrice
        Scanner sc = new Scanner(System.in);

        // verification de conditions
        do {
            System.out.println("donner nl");
            nl = sc.nextInt();
        } while (nl < 0 && nl > 30);
        do {
            System.out.println("donner nc");
            nc = sc.nextInt();
        } while (nl < 0 && nc > 30);

        // remplis de matrice
        for (int i = 0; i < nl; i++) {
            for (int j = 0; j < nc; j++) {
                System.out.println("m[" + i + "," + j + "]=");
                m[i][j] = sc.nextInt();
            }
        }

        int somme = 0, pr = 1;
        float moy;
        for (int i = 0; i < nl; i++) {
            for (int j = 0; j < nc; j++) {
                somme = somme + m[i][j]; // somme de matrice
                pr = pr * m[i][j]; // produit de matrice
            }
        }
        moy = (float) somme / (nl * nc); // moyenne de matrice
        System.out.println("somme: " + somme + " moyenne: " + moy + " produit: " + pr); // affichage
        sc.close();
    }
}
