public class KartuDebitApp {
    public static void main(String[] args) {
        KartuDebit card = new KartuDebit("888", "999", "123");
        MesinATM machine = new MesinATM();

        machine.init(card);

    }
}
