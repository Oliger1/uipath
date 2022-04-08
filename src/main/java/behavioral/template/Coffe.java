package behavioral.template;

public class Coffe extends HotBeverage{
    @Override
    void brew() {
        System.out.println("Hedhja e kafese ...");
    }

    @Override
    void addCondiments() {
        System.out.println("Shtimi u qumeshtit ...");
    }
}
