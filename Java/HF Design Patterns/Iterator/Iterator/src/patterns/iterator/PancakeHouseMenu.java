package patterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu {
    private ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu(){
        menuItems = new ArrayList<>();
        populateManu();

    }

    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    private void populateManu(){
        addItem("PancakeHouseMenuname1", "PancakeHouseMenudescription1", true, 10);
        addItem("PancakeHouseMenuname2", "PancakeHouseMenudescription2", true, 20);
        addItem("PancakeHouseMenuname3", "PancakeHouseMenudescription3", false, 30);
        addItem("PancakeHouseMenuname4", "PancakeHouseMenudescription4", false, 40);

    }

    public Iterator<MenuItem> createIterator(){
        return menuItems.iterator();
    }

    /**
     * Used in custom iterator implementation
     */
//    public Iterator createIterator() {
//        return new PancakeHouseMenuIterator(menuItems);
//    }
}
