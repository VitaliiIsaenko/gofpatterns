package patterns.composite;

public class Program {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("Pancake house menu", "Breskfast");
        MenuComponent dinerMenu = new Menu("Diner menu", "Lunch");
        MenuComponent cafeMenu = new Menu("Cafe menu", "Dinner");
        MenuComponent dessertMenu = new Menu("Dessert menu", "Dessert of course!");

        MenuComponent allMenus = new Menu("All menus", "All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        dinerMenu.add(new MenuItem("Pasta", "Spagetti with Marinara Sauce", true, 3.8));

        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem("Apple pie", "Apple pie is very tasty", true, 1.59));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
