package tp11;

import java.util.Scanner;

public class ex1 {
    public static int lectureN() {
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("donner un entier strictement positive");
            n = sc.nextInt();
        } while (n <= 0);
        sc.close();
        return n;
    }

    public static void remplirTab(int n) {
        n = lectureN();
        int t[] = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= n; i++) {
            System.out.println("donner entier numero" + i);
            t[i] = sc.nextInt();
            sc.close();
        }
    }

    public static void remplacer(int x1, int x2, int[] t, int n) {
        for (int i = 0; i <= n; i++) {
            if (t[i] == x1) {
                t[i] = x2;
            }
        }
    }

    public static void affichetab(int[] t, int n) {
        for (int i = 0; i <= n; i++) {
            System.out.println(t[i] + "/n");
        }
    }

    public static void main(String[] args) {
        int n;
        n = lectureN();

    }
}
