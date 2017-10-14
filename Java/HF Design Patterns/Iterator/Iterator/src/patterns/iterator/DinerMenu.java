package patterns.iterator;


import java.util.Iterator;

public class DinerMenu implements Menu {
    private static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private MenuItem[] menuItems;
    private int position;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        populateManu();
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full! Can't add item to menu.");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

    /**
     * used in custom iterator implementation
     */
//    public Iterator createIterator() {
//        return new DinnerMenuIterator(menuItems);
//    }

    private void populateManu() {
        addItem("DinerMenuname1", "DinerMenudescription1", true, 10);
        addItem("DinerMenuname2", "DinerMenudescription2", true, 20);
        addItem("DinerMenuname3", "DinerMenudescription3", false, 30);
        addItem("DinerMenuname4", "DinerMenudescription4", false, 40);

    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return new DinnerMenuIterator(menuItems);
    }
}
