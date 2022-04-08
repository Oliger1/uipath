package behavioral.template;

public class HotBeverageTest {
    public static void main(String[] args){
        System.out.println("-----------Pija e pare------------");
        HotBeverage beverage = new Coffe();
        beverage.prepareRecipe();

        System.out.println("-----------Pija e dyte------------");
        HotBeverage beverage2 = new Tea();
        beverage2.prepareRecipe();
    }
}
