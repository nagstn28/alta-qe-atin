package Data;

public class Fakbil2 {
    public static void main(String[] args) {
        int bilangan = 6;
        int bil = 20;

        for (int i=bilangan; i>0; i--) {
            if (bilangan % i == 0) {
                System.out.println(i + " ");
            }
        }

        System.out.println();

        for (int j=bil; j>0; j--) {
            if (bil % j == 0) {
                System.out.println(j + " ");
            }
        }
    }
}
