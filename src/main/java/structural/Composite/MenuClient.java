package structural.Composite;

import javax.naming.OperationNotSupportedException;

public class MenuClient {
    public static void main(String[] args) throws OperationNotSupportedException {
        MenuComponent baseMenu = new Menu("Menu", "Menu");
        MenuComponent pizzaMenu = new Menu("Pizza", "Menu per pizza");
        MenuComponent drinkMenu = new Menu("Pijet", "Menu e pijeve");
        MenuComponent alcoholicDrink = new Menu("Pijet alkolike", "Menu per pijet alkolike");
        MenuComponent nonAlcoholicDrinks = new Menu("Pije jo alkolike", "Menu per pije jo alkolike");
        baseMenu.addComponent(pizzaMenu);
        baseMenu.addComponent(drinkMenu);
        drinkMenu.addComponent(alcoholicDrink);
        drinkMenu.addComponent(nonAlcoholicDrinks);

        MenuComponent pizzaMargarita = new MenuItem("Pizza Margarita", "Piza margarita", 500.0f);
        MenuComponent pizzaTon = new MenuItem("Pizza Ton", "Pizza me ton", 550.0f);
        MenuComponent pizzaVeggie = new MenuItem("Pizza vegjetariane", "Pizza me perime", 600.0f);
        pizzaMenu.addComponent(pizzaMargarita);
        pizzaMenu.addComponent(pizzaTon);
        pizzaMenu.addComponent(pizzaVeggie);

        MenuComponent bravo = new MenuItem("Bravo", "bravo pije me shije pjeshke", 150.0f);
        MenuComponent amita = new MenuItem("Amita", "Amita me shije qershire", 150.0f);
        MenuComponent santal = new MenuItem("Santal", "Santal me shije dardhe", 150.0f);
        nonAlcoholicDrinks.addComponent(bravo);
        nonAlcoholicDrinks.addComponent(amita);
        nonAlcoholicDrinks.addComponent(santal);

        MenuComponent birraKorca = new MenuItem("Birra Korca", "birre", 200.0f);
        MenuComponent birraAmstel = new MenuItem("Birra Amstel", "birre", 200.0f);
        MenuComponent birraTuborg = new MenuItem("Birra Tuborg", "birre", 200.0f);
        alcoholicDrink.addComponent(birraKorca);
        alcoholicDrink.addComponent(birraAmstel);
        alcoholicDrink.addComponent(birraTuborg);

        baseMenu.printMenu();
    }
}
