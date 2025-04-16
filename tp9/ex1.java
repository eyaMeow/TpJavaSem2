package tp9;

import java.util.Scanner;

public class ex1 {
    public static int lectureN() {
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("donner un entier positif");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("verifier!!");
            }
        } while (n <= 0);
        return n;
    }

    public static boolean pair(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        int[] t = new int[10];
        for (int i = 0; i <= 9; i++) {
            t[i] = lectureN();
        }
        for (int n : t) {
            if (pair(n) == true) {
                System.out.println(n);
            }
        }
    }
}
