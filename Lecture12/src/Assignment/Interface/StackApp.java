package Assignment.Interface;

public class StackApp {
    public static void main(String[] args) {
        StackImpl run = new StackImpl(3);
        run.push(2);
        run.push(4);
        run.push(1);
        run.displayStack();
    }
}
