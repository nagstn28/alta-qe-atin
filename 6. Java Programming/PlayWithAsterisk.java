package Data;

public class PlayWithAsterisk {
    public static void main(String[] args) {
        int x = 5;
        System.out.print("Banyaknya Baris: " + x);
        System.out.println();

        for (int i=1; i<=x; i++) {
            for (int j=x-1; j>=i; j--) {
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++) {
                System.out.print(" *");
            }
            System.out.println("");
        }
    }
}
