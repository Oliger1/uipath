package structural.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class StoreItemFactory {
    static Map<Integer, StoreItem> storeItems = new HashMap<Integer, StoreItem>();

    public static StoreItem getStoreItem(int id, String name, String description, double price, String photoPath) {
        StoreItem item = storeItems.get(id);
        if (item == null) {
            item = new StoreItem(id, name, description, price, photoPath);
            storeItems.put(id, item);
        }
        return item;
    }
}
