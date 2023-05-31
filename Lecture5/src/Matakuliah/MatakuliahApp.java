package Matakuliah;

public class MatakuliahApp {

    public static double hitungIPK(Matakuliah mk1, Matakuliah mk2, Matakuliah mk3) {
        double totalNilaiSks = (mk1.nilaiIndex(mk1.getIndex()) * mk1.getSks()) +
                (mk2.nilaiIndex(mk2.getIndex()) * mk2.getSks()) +
                (mk3.nilaiIndex(mk3.getIndex()) * mk3.getSks());
        double totalSks = mk1.getSks() + mk2.getSks() + mk3.getSks();
        double ipk = totalNilaiSks / totalSks;
        return ipk;
    }

    public static void main(String[] args) {
        Matakuliah mk1 = new Matakuliah("001", "Alpro 1", "A", 3);
        Matakuliah mk2 = new Matakuliah("002", "Alpro 2", "BC", 3);
        Matakuliah mk3= new Matakuliah("003", "PBO", "B", 3);

        System.out.println("---- DAFTAR MATAKULIAH ----");
        System.out.println("+--------------------------------------------------+");
        System.out.printf("| %-5s| %-20s| %-8s| %-5s|\n", "Kode", "Nama Matakuliah", "Index", "SKS");
        System.out.println("+--------------------------------------------------+");
        System.out.printf("| %-5s| %-20s| %-8s| %-5s|\n", mk1.getKode(), mk1.getNama(), mk1.getIndex(), mk1.getSks());
        System.out.printf("| %-5s| %-20s| %-8s| %-5s|\n", mk2.getKode(), mk2.getNama(), mk2.getIndex(), mk2.getSks());
        System.out.printf("| %-5s| %-20s| %-8s| %-5s|\n", mk3.getKode(), mk3.getNama(), mk3.getIndex(), mk3.getSks());
        System.out.println("+--------------------------------------------------+");

        // hitung ipk
        double ipk = hitungIPK(mk1, mk2, mk3);

        // menampilkan hasil perhitungan IPK
        System.out.printf("IPK: %.2f", ipk);


    }

}
