package creational.AbstractFactory;

public class ArtDecoChair extends Chair {
    public float price;
    public int numberOfLegs;

    ArtDecoChair(float price, int numberOfLegs) {
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
        System.out.println("Karrige Art Deco me cmim: " + price);
    }
}
