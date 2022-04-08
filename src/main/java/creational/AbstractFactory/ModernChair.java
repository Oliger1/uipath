package creational.AbstractFactory;

public class ModernChair extends Chair {
    public float price;
    public int numberOfLegs;

    ModernChair(float price, int numberOfLegs) {
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
        System.out.println("Karrige moderne me cmim: " + price);
    }
}
