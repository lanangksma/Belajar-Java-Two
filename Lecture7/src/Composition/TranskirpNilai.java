package Composition;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TranskirpNilai {
    private Date tglCetak;
    private double ipk = 0;
    private List<KartuHasilStudi> kartuHasilStudi;
    private Mahasiswa mahasiswa;

    public TranskirpNilai(Mahasiswa mahasiswa) {
        super();
        this.mahasiswa = mahasiswa;
        kartuHasilStudi = new ArrayList<KartuHasilStudi>();
        tglCetak = new Date();
    }

    public void hitungIPK() {
        double totalSKS = 0;
        double totalNilai = 0;
        for (KartuHasilStudi khs : kartuHasilStudi){
            for (Matakuliah mk : khs.getDaftarMatakuliah()){
                totalSKS += mk.getSks();
                totalNilai += mk.getSks() * mk.nilaiIndex();
            }
        }
        ipk = totalNilai / totalSKS;
    }

    public void addKHS(KartuHasilStudi khs) {
        kartuHasilStudi.add(khs);
    }

    public void display() {
        System.out.println(mahasiswa.display());
        System.out.println("Tanggal Cetak: " + tglCetak.toString());
        System.out.println("IPK: " + ipk);
        for (KartuHasilStudi khs : kartuHasilStudi) {
            System.out.println(khs.display());
        }
    }

    public Date getTglCetak() {
        return tglCetak;
    }

    public void setTglCetak(Date tglCetak) {
        this.tglCetak = tglCetak;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public List<KartuHasilStudi> getKartuHasilStudi() {
        return kartuHasilStudi;
    }

    public void setKartuHasilStudi(List<KartuHasilStudi> kartuHasilStudi) {
        this.kartuHasilStudi = kartuHasilStudi;
    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }
}