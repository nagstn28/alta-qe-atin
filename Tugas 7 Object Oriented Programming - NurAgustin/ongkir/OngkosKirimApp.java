package ongkir;

public class OngkosKirimApp {
    public static void main (String[] agrs){
        Barang barang = new Barang();
        Ongkos ongkos = new Ongkos();

        barang.panjang = 5;
        barang.lebar = 2;
        barang.tinggi = 4;
        barang.berat = 1;


        ongkos.syarat(barang.volume(), barang.berat());
    }
}