package TP8;

import java.util.Scanner;

public class exerciceDeClass {
    public static void main(String[] args) {
        String mot1, mot2, texte, t2;
        Scanner sc = new Scanner(System.in);
        System.out.println("saisir un texte");
        texte = sc.nextLine();
        System.out.println("donner mot1");
        mot1 = sc.next();
        System.out.println("donner mot2");
        mot2 = sc.next();
        if (texte.indexOf(mot1) == -1) {
            System.out.println("mot1 n'existe pas dans le texte");
        } else {
            t2 = texte.replace(mot1, mot2);
            System.out.println("new phrase: " + t2);
        }
        sc.close();
    }
}
