import java.util.Scanner;

public class matrice {
    public static void main(String[] args) {
        // Déclaration d'une matrice de taille 50x50
        int[][] m = new int[50][50];
        int nl, nc;
        Scanner sc = new Scanner(System.in);

        // Demander à l'utilisateur de saisir le nombre de lignes (nl) avec vérification
        do {
            System.out.println("donner nl");
            nl = sc.nextInt();
        } while (nl > 50);

        // Demander à l'utilisateur de saisir le nombre de colonnes (nc) avec
        // vérification
        do {
            System.out.println("donner nc");
            nc = sc.nextInt();
        } while (nc > 50);

        // Remplir la matrice m avec des valeurs paires uniquement
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
        // Demander à l'utilisateur de saisir un nombre x (qui doit être pair)
        do {
            System.out.println("donner x");
            x = sc.nextInt();
        } while (x % 2 != 0);

        boolean ok = false;
        int i = 0, j = 0;

        // Recherche de x dans la matrice
        while (ok == false && i < nl && j < nc) {
            if (m[i][j] == x) { // Si la valeur x est trouvée
                ok = true;
            } else if (i < nl && j == (nc - 1)) { // Si on arrive à la fin d'une ligne
                j = 0; // Revenir au début de la ligne suivante
                i++; // Passer à la ligne suivante
            } else {
                j++; // Passer à l'élément suivant dans la même ligne
            }
        }

        // Afficher le résultat de la recherche
        if (ok) {
            System.out.println(x + " existe");
        } else {
            System.out.println(x + " existe pas");
        }
    }
}
