package structural.Bridge;

public class ShapeClient {
    public static void main(String[] args) {
        System.out.println("Forma e pare");
        Color red = new Red();
        Shape circle = new Circle(red);
        circle.draw();
        System.out.println("------------------------------------------------");
        System.out.println("Forma e dyte");
        Color green = new Green();
        Shape triangle = new Triangle(green);
        triangle.draw();


    }
}
