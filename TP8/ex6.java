package TP8;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] t = new int[6];
        String ch, ch1;
        System.out.println("donner un mot: ");
        ch1 = sc.nextLine();
        ch = ch1.toLowerCase();
        for (int i = 0; i < ch.length(); i++) {
            if (ch.charAt(i) == 'a') {
                t[0]++;
            } else if (ch.charAt(i) == 'e') {
                t[1]++;
            } else if (ch.charAt(i) == 'i') {
                t[2]++;
            } else if (ch.charAt(i) == 'o') {
                t[3]++;
            } else if (ch.charAt(i) == 'u') {
                t[4]++;
            } else if (ch.charAt(i) == 'y') {
                t[5]++;
            }

        }
        System.out.println(t[0] + " fois la lettre a");
        System.out.println(t[1] + " fois la lettre e");
        System.out.println(t[2] + " fois la lettre i");
        System.out.println(t[3] + " fois la lettre o");
        System.out.println(t[4] + " fois la lettre u");
        System.out.println(t[5] + " fois la lettre y");
    }

}
