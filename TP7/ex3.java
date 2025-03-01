import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        int[][] m = new int[20][30]; // Déclaration d'une matrice de taille 20x30
        int[] t = new int[20]; // Déclaration d'un tableau de taille 20 pour stocker les sommes des lignes
        int nl, nc;
        Scanner sc = new Scanner(System.in);

        // Demander à l'utilisateur de saisir le nombre de lignes (nl) avec vérification
        do {
            System.out.println("donner nl");
            nl = sc.nextInt();
        } while (nl > 20 || nl < 0); // nl doit être entre 0 et 20

        // Demander à l'utilisateur de saisir le nombre de colonnes (nc) avec
        // vérification
        do {
            System.out.println("donner nc");
            nc = sc.nextInt();
        } while (nc > 30 || nc < 0); // nc doit être entre 0 et 30

        // Demander à l'utilisateur de saisir les éléments de la matrice
        for (int i = 0; i < nl; i++) {
            for (int j = 0; j < nc; j++) {
                System.out.println("donner M[" + i + "," + j + "]");
                m[i][j] = sc.nextInt();
            }
            // Fermer le scanner (ça devrait être en dehors de cette boucle)
            sc.close();
        }

        // Calculer la somme des éléments de chaque ligne et stocker le résultat dans t
        for (int i = 0; i < nl; i++) {
            int somme = 0;
            for (int j = 0; j < nc; j++) {
                somme += m[i][j];
            }
            t[i] = somme; // Stocker la somme dans le tableau t
        }

        // Afficher les sommes des lignes
        for (int i = 0; i < nl; i++) {
            System.out.println(t[i]);
        }
    }
}
