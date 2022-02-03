package ongkir;

public class Barang {
    public float panjang,lebar,tinggi,berat;
    public String volume;

    public float volume() {
        float volume = panjang * lebar * tinggi;
        System.out.println("Ukuran Barang Anda :"+volume + " cm3");
        return volume;
    }

    public float berat() {
        System.out.println("Berat Barang Anda : "+Math.ceil(berat) + " kg");
        return berat;
    }
}