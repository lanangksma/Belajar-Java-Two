package Inheritance;

public class Orang {

    protected String nama;
    protected String alamat;

    public Orang(String nama, String alamat){
        this.nama = nama;
        this.alamat = alamat;
    }

    public Orang() {
        nama = "Asep";
        alamat = "Sumatra Barat";
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

}
