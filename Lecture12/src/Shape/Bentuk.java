package Shape;

public abstract class Bentuk {
    protected int jariJari;
    protected final double PI = 3.14;

    public Bentuk(int jariJari) {
        super();
        this.jariJari = jariJari;
    }

    public abstract double hitungLuas();

    public int getJariJari() {
        return jariJari;
    }

    public void setJariJari(int jariJari) {
        this.jariJari = jariJari;
    }
}
