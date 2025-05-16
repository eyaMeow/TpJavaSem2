package tp12;

public class ex1 {
    public static int fact(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n + fact(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = tp11.methodes.lectureUnEntierStrictPos();
        System.out.println("le somme est: " + fact(n));
    }
}
