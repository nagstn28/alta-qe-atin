package Data;

public class FaktorBilangan {
    public static void main(String[] args) {
       int bilangan = 6;
        int bil = 20;

            for (int i=1; i<=bilangan; i++) {
                if (bilangan % i == 0) {
                    System.out.println(i + " ");
                }
            }

        System.out.println();

            for (int j=1; j<=bil; j++) {
                if (bil % j == 0) {
                    System.out.println(j + " ");
                }
            }
    }
}
