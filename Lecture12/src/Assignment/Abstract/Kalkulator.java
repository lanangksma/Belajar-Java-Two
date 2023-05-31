package Assignment.Abstract;

public class Kalkulator extends AbstractKalkulator {

    public Kalkulator(double angka1, double angka2) {
        super(angka1, angka2);
    }

    @Override
    public double hitungPenjumlahan() {
        return angka1 + angka2;
    }

    @Override
    public double hitungPengurangan() {
        return angka1 - angka2;
    }

    @Override
    public double hitungPerkalian() {
        return angka1 * angka2;
    }

    @Override
    public double hitungPembagian() {
        return angka1 / angka2;
    }
}
