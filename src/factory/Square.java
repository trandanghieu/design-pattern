package factory;

public class Square extends Shape{
    @Override
    void draw() {
        System.out.println("Rectangle -> Draw");
    }

    @Override
    void calS() {
        System.out.println("Rectangle -> calS");
    }
}
