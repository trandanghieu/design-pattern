package singleton;

public class App {
    public static void main(String[] args) {
        Sglc s1 = Sglc.getInstance();
        Sglc s2 = Sglc.getInstance();

        s1.equals(s2); // true

        s1.setValue("S1");

        s1.getValue(); // -> S1
        s2.getValue(); // -> S1
    }
}
