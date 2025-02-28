import java.util.Scanner;

public class tp7matrice {
    public static void main(String[] args) {
        int[][] m = new int[50][50];
        ;
        int nl, nc;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("donner nl");
            nl = sc.nextInt();
        } while (nl > 50);
        do {
            System.out.println("donner nc");
            nc = sc.nextInt();
        } while (nc > 50);
        for (int i = 0; i < nl; i++) {
            for (int j = 0; j < nc; j++) {
                do {
                    System.out.println("m[" + i + "," + j + "]=");
                    m[i][j] = sc.nextInt();
                } while (m[i][j] % 2 != 0);
            }
            sc.close();
        }
        int x;
        do {
            System.out.println("donner x");
            x = sc.nextInt();
        } while (x % 2 != 0);
        boolean ok = false;
        int i = 0, j = 0;
        while (ok == false && i < nl && j < nc) {
            if (m[i][j] == x) {
                ok = true;
            } else if (i < nl && j == (nc - 1)) {
                j = 0;
                i++;
            } else {
                j++;
            }
        }
        if (ok) {
            System.out.println(x + " existe");
        } else {
            System.out.println(x + " existe pas");
        }
    }
}
