package creational.Prototype;

import java.util.Hashtable;

public class PizzaCache {
    private static Hashtable<String, Pizza> hashTable = new Hashtable<String, Pizza>();

    public static Pizza getPizza(String pizaId) {
        Pizza pizza = hashTable.get(pizaId);
        return (Pizza) pizza.clone();
    }

    public static void loadCache() {
        PizzaVegetarian picaVeg = new PizzaVegetarian();
        hashTable.put(picaVeg.getId(), picaVeg);

        PizzaMargarita picaMargarita = new PizzaMargarita();
        hashTable.put(picaMargarita.getId(), picaMargarita);

        PizzaTon pizzaTon = new PizzaTon();
        hashTable.put(pizzaTon.getId(), pizzaTon);
    }
}
