package Inheritance;

public class Mobil extends Kendaraan {

    private String seri;

    public Mobil() {
    }

    public Mobil(String merek, String bahanBakar) {
        super(merek, bahanBakar);
    }

    public Mobil(String merek, String bahanBakar, String seri) {
        super(merek, bahanBakar);
        this.seri = seri;
    }

    public String getSeri() {
        return seri;
    }

    public void setSeri(String seri) {
        this.seri = seri;
    }
}
