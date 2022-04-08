package structural.Decorator;

public class BeverageClient {
    public static void main(String[] args) {
        Beverage beverage = new Decaf();
        Beverage decafWithSoyMilk = new SoyMilkDecorator(beverage);
        Beverage decaWithSoyAndWhip = new WhipMilkDecorator(decafWithSoyMilk);

        System.out.println(decaWithSoyAndWhip.getDescrition());
        System.out.println("Cmimi eshte: " + decaWithSoyAndWhip.cost());
    }
}
