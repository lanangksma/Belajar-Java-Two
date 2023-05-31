import java.util.Scanner;

public class MesinATM {
    private KartuDebit kartuDebit;
    private boolean valid;

    public boolean autentikasi(String pinInput){
        return valid && kartuDebit.getPin().equalsIgnoreCase(pinInput);
    }

    public void init(KartuDebit kartuDebit){
        if (kartuDebit.isValid()){
            this.kartuDebit = kartuDebit;
            valid = true;

            System.out.println("Masukan No. PIN");
            Scanner sc = new Scanner(System.in);
            String pinInput = sc.next();
            if (autentikasi(pinInput)){
                System.out.println("Menu Utama");
            } else {
                System.out.println("No PIN tidak sesuai");
            }
        } else {
            System.out.println("Kartu tidak valid");
        }
    }
}
