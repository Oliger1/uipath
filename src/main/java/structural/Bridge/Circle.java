package structural.Bridge;

public class Circle extends Shape {
    Circle(Color color) {
        this.color = color;
    }

    @Override
    void draw() {
        System.out.println("Duke u vizatuar nje rreth");
        color.fill();
    }
}
