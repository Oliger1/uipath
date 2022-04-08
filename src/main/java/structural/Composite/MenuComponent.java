package structural.Composite;

import javax.naming.OperationNotSupportedException;

public interface MenuComponent {
    public void printMenu();

    public void addComponent(MenuComponent component) throws OperationNotSupportedException;

    public void removeComponent(MenuComponent component) throws OperationNotSupportedException;

    public float getPrice() throws OperationNotSupportedException;

    public String getName();

    public String getDescription();
}
