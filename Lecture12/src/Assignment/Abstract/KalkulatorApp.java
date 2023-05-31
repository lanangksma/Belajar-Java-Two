package Assignment.Abstract;

public class KalkulatorApp {
    public static void main(String[] args) {
        double angka1, angka2;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        angka1 = sc.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        angka2 = sc.nextDouble();
        Kalkulator kalkulator = new Kalkulator(angka1, angka2);
        System.out.println("Hasil penjumlahan: " + kalkulator.hitungPenjumlahan());
        System.out.println("Hasil pengurangan: " + kalkulator.hitungPengurangan());
        System.out.println("Hasil perkalian: " + kalkulator.hitungPerkalian());
        System.out.println("Hasil pembagian: " + kalkulator.hitungPembagian());
    }
}
