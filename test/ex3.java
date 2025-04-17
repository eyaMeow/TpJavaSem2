package test;

import java.util.Scanner;

public class ex3 {
    public static String groupe(String x) {
        String g;
        x = x.toLowerCase();
        if (x.equals("aller") || x.equals("faire") || x.equals("savoir") || x.equals("sortir")) {
            g = "3ème groupe";
        } else if (x.endsWith("er")) {
            g = "1er groupe";
        } else if (x.endsWith("ir")) {
            g = "2ème groupe";
        } else {
            g = "3ème groupe";
        }
        return g;

    }

    public static boolean estInf(String x) {
        boolean ok = false;
        x = x.toLowerCase();
        if (x.endsWith("er") || x.endsWith("ir") || x.endsWith("re") || x.endsWith("oir")) {
            ok = true;
        } else {
            ok = false;
        }
        return ok;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x;
        do {
            System.out.print("Donner un verbe a linfinitif ");
            x = sc.nextLine();
        } while (estInf(x) == false);
        System.out.println(groupe(x));
    }
}
