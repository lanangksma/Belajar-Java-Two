package Inheritance;

public class InheritanceApp {
    public static void main(String[] args) {

//  Latihan 1

        Mahasiswa mhs = new Mahasiswa();

        mhs.setNama("Asep Saepuloh");
        System.out.println(mhs.getNama());

//  Latihan 2

        Mahasiswa mhs2 = new Mahasiswa();
        System.out.println(mhs2.getNama() + " " + mhs2.getAlamat());

//  Latihan 3

        Mahasiswa mhs3 = new Mahasiswa("Asep Saepuloh", "Sumatra Barat");
        System.out.println(mhs3.getNama()+" "+mhs3.getAlamat());

//  Latihan 4

        Mahasiswa mhs4 = new Mahasiswa("033040046", "Aan Hidayat", "Subang");
        System.out.println(mhs4.getNrp()+" "+mhs4.getNama()+" "+mhs4.getAlamat());
    }
}
