package creational.Prototype;

public class PizzaClient {
    public static void main(String[] args) {
        PizzaCache.loadCache();
        Pizza pizzaMagarita1 = PizzaCache.getPizza("1");
        pizzaMagarita1.setName("Pizza Margarita 1");

        Pizza pizzaMargarita2 = PizzaCache.getPizza("1");
        pizzaMargarita2.setName("Pizza Margarita 2");

        if (pizzaMagarita1 == pizzaMargarita2)
            System.out.println("Picat referojne ne te njejten adrese!");
        else
            System.out.println("Picat nuk referojne ne te njejten adrese!");

        System.out.println("Pica e pare eshte " + pizzaMagarita1.getName());
        System.out.println("Pica e dyte eshte: " + pizzaMargarita2.getName());

    }
}
