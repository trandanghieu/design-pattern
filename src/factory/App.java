package factory;

public class App {
    public static void main(String[] args) {
        Shape shapeObj = ShapeFactory.createShape(ShapeType.RECTANGLE);
        shapeObj.draw();
    }
}
