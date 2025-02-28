import java.util.Scanner;

public class tp7ex3 {
    public static void main(String[] args) {
        int[][] m = new int[20][30];
        int[] t = new int[20];
        int nl, nc;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("donner nl");
            nl = sc.nextInt();
        } while (nl > 20 || nl < 0);
        do {
            System.out.println("donner nc");
            nc = sc.nextInt();
        } while (nc > 30 || nc < 0);
        for (int i = 0; i < nl; i++) {
            for (int j = 0; j < nc; j++) {
                System.out.println("donner M[" + i + "," + j + "]");
                m[i][j] = sc.nextInt();
            }
            sc.close();
        }
        for (int i = 0; i < nl; i++) {
            int somme = 0;
            for (int j = 0; j < nc; j++) {
                somme += m[i][j];
            }
            t[i] = somme;
        }
        for (int i = 0; i < nl; i++) {
            System.out.println(t[i]);
        }
    }
}