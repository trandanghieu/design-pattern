package singleton;

public class Sglc {
    private static Sglc instance = null;
    public static Sglc getInstance() {
        if (instance == null) {
            instance = new Sglc();
        }
        return instance;
    }

    private String value;
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Sglc{" +
                "value='" + value + '\'' +
                '}';
    }
}
