package Composition;

public class Matakuliah {
    private String kode;
    private String nama;
    private String index;
    int sks;

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public Matakuliah(String kode, String nama, String index, int sks) {
        super();
        this.kode = kode;
        this.nama = nama;
        this.index = index;
        this.sks = sks;
    }

    public double nilaiIndex() {

        double nilaiIndeks = 0;
        switch (index) {
            case "A":
                nilaiIndeks = 4;
                break;
            case "AB":
                nilaiIndeks = 3.5;
                break;
            case "B":
                nilaiIndeks = 3;
                break;
            case "BC":
                nilaiIndeks = 2.5;
                break;
            case "C":
                nilaiIndeks = 2;
                break;
            case "D":
                nilaiIndeks = 1;
                break;
            case "E":
                nilaiIndeks = 0;
                break;
            default:
                System.out.println("Nilai huruf tidak valid");
                break;
        }
        return nilaiIndeks;
    }

    public String display() {
        return kode + " - " + nama + " - " + index + " - " + sks;
    }
}
