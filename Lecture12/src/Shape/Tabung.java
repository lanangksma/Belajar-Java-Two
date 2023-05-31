package Shape;

public class Tabung extends Bentuk {
    private int tinggi;

    public Tabung() {
        super(0);
    }

    public Tabung(int jariJari, int tinggi) {
        super(jariJari);
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuas() {
        return 2 * PI * jariJari * (jariJari + tinggi);
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
}
