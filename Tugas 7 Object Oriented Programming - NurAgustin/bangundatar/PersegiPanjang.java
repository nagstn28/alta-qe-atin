package bangundatar;

public class PersegiPanjang {
    int panjang;
    int lebar;

    public PersegiPanjang(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public float luas(){
        return this.panjang * this.lebar;
    }

    public float keliling(){
        return 2 * (this.panjang + this.lebar);
    }

}
