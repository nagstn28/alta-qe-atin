package bangundatar;

public class Main {
    public static void main(String[] args) {
        BangunDatar bangunDatar = new BangunDatar();
        Persegi persegi = new Persegi(4);
        Segitiga segitiga = new Segitiga(3, 4);
        PersegiPanjang persegiPanjang = new PersegiPanjang(7, 8);

        bangunDatar.luas();
        bangunDatar.keliling();

        System.out.println("Luas Persegi :   " + persegi.luas());
        System.out.println("Luas Segitiga :   " + segitiga.luas());
        System.out.println("Luas Persegi Panjang : " + persegiPanjang.luas());

        System.out.println("Keliling Persegi :   " + persegi.keliling());
        System.out.println("Keliling Segitiga :   " + segitiga.keliling());
        System.out.println(" Keliling Persegi Panjang : " + persegiPanjang.keliling());
    }
}

