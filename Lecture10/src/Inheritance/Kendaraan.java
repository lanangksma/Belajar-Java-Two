package Inheritance;

public class Kendaraan {

    protected String merek;
    protected String bahanBakar;

    public Kendaraan() {
        merek = "Hino";
        bahanBakar = "Disel";
    }

    public Kendaraan(String merek, String bahanBakar) {
        this.merek = merek;
        this.bahanBakar = bahanBakar;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getBahanBakar() {
        return bahanBakar;
    }

    public void setBahanBakar(String bahanBakar) {
        this.bahanBakar = bahanBakar;
    }
}
