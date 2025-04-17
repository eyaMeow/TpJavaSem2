package test;

import java.util.Scanner;

public class ex1 {
    public static int lecture() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Donner un entier strictement positif : ");
            while (!sc.hasNextInt()) {
                System.out.print("Ce n'est pas un entier. Réessayez : ");
                sc.next();
            }
            n = sc.nextInt();
        } while (n <= 0);
        return n;
    }

    public static int countt(int n) {
        int x = 0;
        do {
            n = n / 10;
            x = x + 1;
        } while (n > 0);
        return x;
    }

    public static void main(String[] args) {
        int n = lecture();
        System.out.println("le nombre des chiffres dans" + n + "=" + countt(n));
    }
}
