package Gelas;

public class GelasApp {
    static void tukarWarnaGelas(Gelas g1, Gelas g2){
        Gelas gTemp = new Gelas("Temp");
        gTemp.setWarna(g1.getWarna());
        g1.setWarna(g2.getWarna());
        g2.setWarna(gTemp.getWarna());
    }

    public static void main(String[] args) {
        Gelas g1 = new Gelas("Hitam");
        Gelas g2 = new Gelas("Biru");

        tukarWarnaGelas(g1, g2);
        System.out.println("Warna Gelas Pertama: "+g1.getWarna());
        System.out.println("Warna Gelas Kedua: "+g2.getWarna());
    }
}
