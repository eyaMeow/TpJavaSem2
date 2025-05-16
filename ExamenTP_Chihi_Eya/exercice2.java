package ExamenTP_Chihi_Eya;

import java.util.Scanner;

public class exercice2 {
    public static void main(String[] args) {
        String a, c;
        double b, x;
        Scanner sc = new Scanner(System.in);
        String[][] VOL = { { "NumVol", "VDep", "VDest", "CodeAv", "ClassAv", "PrixVol" },
                { "1", "Tozeur", "Djerba", "Ab01", "A1", "156" },
                { "2", "Tozeur", "Tunis", "Ab02", "A2", "250" },
                { "3", "Tunis", "Djerba", "Ab03", "A1", "140" },
                { "4", "Djerba", "Sfax", "Ab04", "A2", "120" } };
        do {
            System.out.println("donner la premiere lettre de la ville de destination: ");
            a = sc.nextLine();
            a = a.toUpperCase();
        } while (a.length() > 1);
        if (VOL[1][2].startsWith(a)) {
            System.out.println("NumVol: " + VOL[1][0] + " VDep:  " + VOL[1][1] + " VDest: " + VOL[1][2] + " CodeAv: "
                    + VOL[1][3] + " ClassAv: "
                    + VOL[1][4] + " PrixVol: " + VOL[1][5]);
        }
        if (VOL[2][2].startsWith(a)) {
            System.out.println("NumVol: "
                    + VOL[2][0] + " VDep:  " + VOL[2][1] + " VDest: " + VOL[2][2] + " CodeAv: " + VOL[2][3]
                    + " ClassAv: "
                    + VOL[2][4] + " PrixVol: " + VOL[2][5]);
        }
        if (VOL[3][2].startsWith(a)) {
            System.out.println("NumVol: "
                    + VOL[3][0] + " VDep:  " + VOL[3][1] + " VDest: " + VOL[3][2] + " CodeAv: " + VOL[3][3]
                    + " ClassAv: "
                    + VOL[3][4] + " PrixVol: " + VOL[3][5]);
        }
        if (VOL[4][2].startsWith(a)) {
            System.out.println("NumVol: "
                    + VOL[4][0] + " VDep:  " + VOL[4][1] + " VDest: " + VOL[4][2] + " CodeAv: " + VOL[4][3]
                    + " ClassAv: "
                    + VOL[4][4] + " PrixVol: " + VOL[4][5]);
        }
        for (int i = 1; i <= 4; i++) {
            x = ExamenTP_Chihi_Eya.exercice1.Convertir(VOL[i][5]);
            b = x * 0.8;
            c = Double.toString(b);
            VOL[i][5] = c;
        }
        System.out.println("Application d'une remise de 80% sur tous les vols...");
        System.out.println("Tableau apres remise: ");
        for (int i = 1; i <= 4; i++) {
            System.out.println("NumVol: "
                    + VOL[i][0] + " VDep:  " + VOL[i][1] + " VDest: " + VOL[i][2] + " CodeAv: " + VOL[i][3]
                    + " ClassAv: "
                    + VOL[i][4] + " PrixVol: " + VOL[i][5]);
        }
    }
}
