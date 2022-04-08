package creational.AbstractFactory;

public class ArtDecoTable extends Table {
    public float price;
    public int numberOfLegs;

    ArtDecoTable(float price, int numberOfLegs) {
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
        System.out.println("Tavoline Art Deco me cmim: " + price);
    }
}
