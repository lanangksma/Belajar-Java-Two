package Lecture4;

public class StudentsApp {
    public static void main(String[] args) {
        Students x = new Students();
        Students y = x;
        x.setNrp("01");
        y.setNrp("02");
        System.out.println(x.getNrp());
        Students z = new Students();
        z.setNrp("03");
        x=z;
        System.out.println(x.getNrp());
        System.out.println(y.getNrp());
    }
}
