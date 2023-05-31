package Card;

public class KartuApp {
    public static void main(String[] args) {
        KartuElektronik kartu = new KartuElektronik("BNI", "1234");
        System.out.println("Autentikasi: " + kartu.autentikasi("1234"));
    }
}
