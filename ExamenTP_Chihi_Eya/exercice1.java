package ExamenTP_Chihi_Eya;

public class exercice1 {
    public static double Convertir(String chaine) {
        return Double.parseDouble(chaine);
    }

    public static void affichageM(String m[][]) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.println(m[i][j]); // afficher les contenu d'un tableau
            }
        }
    }
}
