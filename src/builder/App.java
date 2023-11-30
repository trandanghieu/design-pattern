package builder;

public class App {
    public static void main(String[] args) {
        User u = User.builder()
                            .firstName("Hieu")
                            .lastName("TranDang")
                            .age(21).address("DaNang")
                            .phone("0388344614").build();

        System.out.println(u);
    }
}
