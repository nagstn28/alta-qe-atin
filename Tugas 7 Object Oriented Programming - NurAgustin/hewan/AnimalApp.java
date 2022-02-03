package hewan;

public class AnimalApp {
    public static void main(String[] args){
        Animal animal = new Animal();
        Herbivora herbivor = new Herbivora();
        herbivor.namaBinatang = "Kambing";
        herbivor.jenisMakanan = "'tumbuhan'";
        herbivor.jenisGigi = "tumpul";

        Carnivora carnivor = new Carnivora();
        carnivor.namaBinatang = "Harimau";
        carnivor.jenisMakanan = "'daging'";
        carnivor.jenisGigi = "tajam";

        Omnivora omnivor = new Omnivora();
        omnivor.namaBinatang = "Ayam";
        omnivor.jenisMakanan = "'semua'";
        omnivor.jenisGigi = "tajam dan tumpul";

        animal.identity_myself();
        herbivor.identity_myself();
        carnivor.identity_myself();
        omnivor.identity_myself();
    }
}
