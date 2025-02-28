package TP8;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        String mot1, mot2;
        StringBuffer texte;
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir un texte");
        texte = new StringBuffer(sc.nextLine());
        System.out.println("Donner mot1");
        mot1 = sc.next();
        System.out.println("Donner mot2");
        mot2 = sc.next();
        if (texte.indexOf(mot1) == -1) {
            System.out.println("mot1 n'existe pas dans le texte");
        } else {
            a = texte.indexOf(mot1);
            b = a + mot1.length();
            texte.replace(a, b, mot2);
            System.out.println("New phrase: " + texte);
        }
        sc.close();
    }
}
