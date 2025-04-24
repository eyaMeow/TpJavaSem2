package tp11;

public class ex2 {
    public static void main(String[] args) {
        int n;
        int[] t = new int[100];
        n = tp11.methodes.lectureSupDis();
        tp11.methodes.remplirDesNotes(n, t);
        System.out.println("le moyenne de class: " + tp11.methodes.calculmoy(t, n));
        System.out.println("les notes superieure de moyenne: " + tp11.methodes.countNbPlusMoy(t, n));
    }
}
