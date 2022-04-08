package behavioral.template;

public abstract class HotBeverage {

    void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();
    abstract  void addCondiments();

    void boilWater() {
        System.out.println("Zjerja e ujit ...");
    }
    void pourInCup(){
            System.out.println("Hedhja ne filxhan ....");
    }
}
