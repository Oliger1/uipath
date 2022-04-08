package behavioral.template;

public class Tea extends HotBeverage{
    @Override
    void brew() {
        System.out.println("Hedhja e pustines se cajit ...");
    }

    @Override
    void addCondiments() {
        System.out.println("Shtimi i limonit ...");
    }
}
