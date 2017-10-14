package patterns.iterator.customiterator;

import patterns.iterator.MenuItem;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator {
    private ArrayList<MenuItem> items;
    private int positon;

    public PancakeHouseMenuIterator(ArrayList<MenuItem> menuItems) {
        items = menuItems;
    }


    @Override
    public boolean hasNext() {
        if (items.size() > positon) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        MenuItem item = items.get(positon);
        positon++;
        return item;
    }
}
