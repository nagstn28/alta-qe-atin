package ongkir;

public class Ongkos {

    public static void syarat(float volume, float berat) {
        if (volume <= 50 && berat == 1){
            System.out.println("Harga Yang Harus Dibayar: Rp 5000");
        }
        else{
            System.out.println("Maaf, Barang Anda Melebihi Harga Standard");
        }
    }
}