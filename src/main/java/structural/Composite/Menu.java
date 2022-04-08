package structural.Composite;

import javax.naming.OperationNotSupportedException;
import java.util.ArrayList;
import java.util.List;

public class Menu implements MenuComponent {
    private String name;
    private String description;
    List<MenuComponent> menuComponentList;

    Menu(String name, String description) {
        menuComponentList = new ArrayList<MenuComponent>();
        this.name = name;
        this.description = description;
    }

    @Override
    public void printMenu() {
        for (MenuComponent menu : menuComponentList) {
            System.out.print(name + "=>");
            menu.printMenu();
        }
    }

    @Override
    public void addComponent(MenuComponent component) throws OperationNotSupportedException {
        menuComponentList.add(component);
    }

    @Override
    public void removeComponent(MenuComponent component) throws OperationNotSupportedException {
        menuComponentList.remove(component);
    }

    @Override
    public float getPrice() throws OperationNotSupportedException {
        throw new OperationNotSupportedException();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDescription() {
        return this.description;
    }
}
