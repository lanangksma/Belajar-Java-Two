package Lecture4;

public class LingkaranApp {

    public static void ubahJari2(Lingkaran obj){
        obj.setJari2(4);
    }
    public static void main(String[] args) {
        Lingkaran li1 = new Lingkaran(5);
        Lingkaran li2 = li1;
        System.out.println(li1.getJari2());
        System.out.println(li2.getJari2());
        ubahJari2(li2);
        System.out.println(li1.getJari2());
        System.out.println(li2.getJari2());

    }
}
