package LingkaranPackage;

public class Lingkaran {
    private double jari2;
    private final static double PHI = 3.14;

    public Lingkaran(){
        double jari2 = 10;
    }

    public double hitungLuas(){
        return PHI*jari2*jari2;
    }
}
