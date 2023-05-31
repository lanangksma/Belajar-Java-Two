package Shape;

public class Lingkaran extends Bentuk{
    public Lingkaran(int jariJari) {
        super(jariJari);
    }

    @Override
    public double hitungLuas() {
        return PI * jariJari * jariJari;
    }
}
