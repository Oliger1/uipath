package creational.AbstractFactory;

public class VictorianTable extends Table {
    public float price;
    public int numberOfLegs;

    VictorianTable(float price, int numberOfLegs) {
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
        System.out.println("Tavoline Viktoriane me cmim: " + price);
    }
}
