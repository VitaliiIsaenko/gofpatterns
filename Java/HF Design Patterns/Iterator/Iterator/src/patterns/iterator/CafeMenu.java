package patterns.iterator;

import java.util.HashMap;
import java.util.Iterator;

public class CafeMenu implements Menu {
    private HashMap<String, MenuItem> menuItems = new HashMap<>();

    public CafeMenu(){
        populateManu();
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

    private void populateManu() {
        addItem("DinerMenuname1", "DinerMenudescription1", true, 10);
        addItem("DinerMenuname2", "DinerMenudescription2", true, 20);
        addItem("DinerMenuname3", "DinerMenudescription3", false, 30);
        addItem("DinerMenuname4", "DinerMenudescription4", false, 40);

    }

    public HashMap<String, MenuItem> getMenuItems() {
        return menuItems;
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.values().iterator();
    }
}
