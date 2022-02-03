package kalkulator;

public class Kalkulator {
    public float hasil;

    public void penjumlahan(float nilai1, float nilai2){
        hasil = nilai1 + nilai2;
        System.out.println("Hasil penjumlahan dari " + nilai1 + " + " + nilai2 + " = " + (hasil));
    }

    public void pengurangan(float nilai1, float nilai2){
        hasil = nilai1 - nilai2;
        System.out.println("Hasil pengurangan dari " + nilai1 + " - " + nilai2 + " = " + (hasil));
    }

    public void perkalian(float nilai1, float nilai2){
        hasil = nilai1 * nilai2;
        System.out.println("Hasil perkalian dari " + nilai1 + " * " + nilai2 + " = " + (hasil));
    }

    public void pembagian(float nilai1, float nilai2){
        hasil = nilai1 / nilai2;
        System.out.println("Hasil pembagian dari " + nilai1 + " / " + nilai2 + " = " + (hasil));
    }
}