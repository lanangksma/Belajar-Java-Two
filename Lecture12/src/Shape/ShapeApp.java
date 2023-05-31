package Shape;

public class ShapeApp {

    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran(10);
        Tabung tabung = new Tabung(10, 5);

        System.out.println("=== Lingkaran ===");
        System.out.println("jari-jari = " + lingkaran.getJariJari());
        System.out.println("luas = " + lingkaran.hitungLuas());

        System.out.println("=== Tabung ===");
        System.out.println("jari-jari = " + tabung.getJariJari()+ ", tinggi = " + tabung.getTinggi());
        System.out.println("luas = " + tabung.hitungLuas());
    }
}
