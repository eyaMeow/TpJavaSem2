package test;

import java.util.Scanner;

public class ex2 {
    public static float add(float a, float b) {
        return a + b;
    }

    public static float sou(float a, float b) {
        return a - b;
    }

    public static float mul(float a, float b) {
        return a * b;
    }

    public static float div(float a, float b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1, n2;
        String y;
        System.out.println("donner l'operation: ");
        y = sc.nextLine();
        System.out.println("donner 1ere untier: ");
        n1 = sc.nextFloat();
        do {
            System.out.print("Donner le 2ème entier : ");
            n2 = sc.nextFloat();
            if (y.equals("/") && n2 == 0) {
                System.out.println("Erreur : division par zéro. Réessayez.");
            }
        } while (y.equals("/") && n2 == 0);
        switch (y) {
            case "+":
                System.out.println("la resultat: " + add(n1, n2));
                break;
            case "-":
                System.out.println("la resultat: " + sou(n1, n2));
                break;
            case "*":
                System.out.println("la resultat: " + mul(n1, n2));
                break;
            case "/":
                System.out.println("la resultat: " + div(n1, n2));
                break;

            default:
                System.out.println("invalide");
        }
    }
}
