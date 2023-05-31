package Card;

public class KartuElektronik implements Kartu {
    private String kodeBank;
    private String pin;

    public KartuElektronik(String kodeBank, String pin) {
        super();
        this.kodeBank = kodeBank;
        this.pin = pin;
    }

    @Override
    public boolean autentikasi(String pin) {
        return this.pin.equals(pin);
    }

    @Override
    public String encodePin(String pin) {
        return null;
    }
}
