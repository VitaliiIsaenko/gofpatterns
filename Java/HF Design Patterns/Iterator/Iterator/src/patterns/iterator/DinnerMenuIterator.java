package patterns.iterator;

import java.util.Iterator;

public class DinnerMenuIterator implements Iterator<MenuItem> {
    private MenuItem[] items;
    private int position = 0;

    public DinnerMenuIterator(MenuItem[] menuItems) {
        items = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        }
        return true;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = items[position];
        position++;
        return menuItem;
    }

    @Override
    public void remove() {
        if(position <= 0){
            throw new IllegalStateException("You cannot remove an item until you have dome at least one next()");
        }
        if (items[position-2] != null) {
            for (int i = position-1; i < (items.length-1); i++)
            {
                items[i]=items[i+1];
            }
            items[items.length-1] = null;
        }
    }
}
