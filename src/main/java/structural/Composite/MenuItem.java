package structural.Composite;

import javax.naming.OperationNotSupportedException;

public class MenuItem implements MenuComponent {
    private String name;
    private String description;
    private float price;

    MenuItem(String name, String description, float price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    @Override
    public void printMenu() {
        System.out.println(name);
    }

    @Override
    public void addComponent(MenuComponent component) throws OperationNotSupportedException {
        throw new OperationNotSupportedException();
    }

    @Override
    public void removeComponent(MenuComponent component) throws OperationNotSupportedException {
        throw new OperationNotSupportedException();
    }

    @Override
    public float getPrice() {
        return this.price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
