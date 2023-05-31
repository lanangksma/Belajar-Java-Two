package Composition;

import java.util.ArrayList;
import java.util.List;

public class KartuHasilStudi {
    private String semester;
    private double IPS;
    private List<Matakuliah> daftarMatakuliah;

    public KartuHasilStudi(String semester){
        this.semester = semester;
        this.daftarMatakuliah = new ArrayList<>();
    }

    public void addMatakuliah(Matakuliah matakuliah){
        daftarMatakuliah.add(matakuliah);
    }

    public String display(){
        StringBuilder stringBuilder = new StringBuilder();
        for (Matakuliah mk : daftarMatakuliah){
            stringBuilder.append(mk.display());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public void hitungIPS(){
        double totalBobotNilai = 0;
        int totalSks = 0;
        for (Matakuliah mk : daftarMatakuliah){
            totalBobotNilai += mk.getSks() * mk.nilaiIndex();
            totalSks += mk.getSks();
        }
        IPS = totalBobotNilai / totalSks;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public double getIPS() {
        return IPS;
    }

    public void setIPS(double IPS) {
        this.IPS = IPS;
    }

    public List<Matakuliah> getDaftarMatakuliah() {
        return daftarMatakuliah;
    }

    public void setDaftarMatakuliah(List<Matakuliah> daftarMatakuliah) {
        this.daftarMatakuliah = daftarMatakuliah;
    }
}
