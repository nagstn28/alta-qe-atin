package volume;

public class Tabung {
    int r;
    int t;
    public Tabung (int r, int t) {
        this.r = r;
        this.t = t;
    }
    public float volume (){
        return 22 * this.r * this.r * this.t / 7;
    }
}
