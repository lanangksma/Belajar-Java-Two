package Assignment.Abstract;

public abstract class AbstractKalkulator {
    protected double angka1;
    protected double angka2;

    public AbstractKalkulator(double angka1, double angka2) {
        this.angka1 = angka1;
        this.angka2 = angka2;
    }

    public abstract double hitungPenjumlahan();
    public abstract double hitungPengurangan();
    public abstract double hitungPerkalian();
    public abstract double hitungPembagian();

    public double getAngka1() {
        return angka1;
    }

    public void setAngka1(double angka1) {
        this.angka1 = angka1;
    }

    public double getAngka2() {
        return angka2;
    }

    public void setAngka2(double angka2) {
        this.angka2 = angka2;
    }
}
