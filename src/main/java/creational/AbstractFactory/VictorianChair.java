package creational.AbstractFactory;

public class VictorianChair extends Chair {
    public float price;
    public int numberOfLegs;

    VictorianChair(float price, int numberOfLegs) {
        this.price = price;
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public float getPrice() {
        return price;
    }

    @Override
    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    @Override
    public void print() {
        System.out.println("Karrige Viktoriane me cmim: " + price);
    }
}
