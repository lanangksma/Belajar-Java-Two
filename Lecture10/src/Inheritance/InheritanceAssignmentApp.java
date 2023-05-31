package Inheritance;

public class InheritanceAssignmentApp {

    public static void main(String[] args) {

//  Tugas seperti latihan 1
        Mobil mbl = new Mobil();
        mbl.setMerek("Toyota");
        System.out.println(mbl.getMerek());

//  Tugas seperti latihan 2
        Mobil mbl2 = new Mobil();
        System.out.println(mbl2.getMerek()+" "+mbl2.getBahanBakar());

//  Tugas seperti latihan 3
        Mobil mbl3 = new Mobil("Wuling", "Bensin");
        System.out.println(mbl3.getMerek()+" "+mbl3.getBahanBakar());

//  Tugas seperti latihan 4
        Mobil mbl4 = new Mobil("Tesla", "Listrik", "Model Y");
        System.out.println(mbl4.getMerek()+" "+mbl4.getBahanBakar()+" "+mbl4.getSeri());

    }
}
