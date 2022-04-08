package creational.Prototype;

public abstract class Pizza implements Cloneable {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void prepare() {
        System.out.println("Duke u pergatitur pizza: " + name);
    }

    public Object clone() {
        Object pizza = null;
        try {
            pizza = super.clone();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        return pizza;
    }
}
