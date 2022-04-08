package structural.Bridge;

public class Triangle extends Shape {
    Triangle(Color color) {
        this.color = color;
    }

    @Override
    void draw() {
        System.out.println("Duke u vizatuar nje trekendesh...");
        color.fill();
    }
}
