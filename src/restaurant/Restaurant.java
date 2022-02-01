package restaurant;

public class Restaurant {
    public static void main(String[] args) {
        MenuItem menu1 = new MenuItem("Mutton Biryani", 12.5, "main course");
        MenuItem menu2 = new MenuItem("Chicken Biryani", 10.0, "main course");
        MenuItem menu3 = new MenuItem("Vegetable Biryani", 8.5, "main course");
        MenuItem menu4 = new MenuItem("Dosa & idly", 2.5, "Break fast");
        MenuItem menu5 = new MenuItem("Dosa & idly", 2.5, "Break fast");

        Menu newMenu = new Menu();


        newMenu.addItem(menu1);
        newMenu.addItem(menu2);
        newMenu.addItem(menu3);
        newMenu.addItem(menu4);
        newMenu.addItem(menu2);
        System.out.println("Try to add item 5");
        newMenu.addItem(menu5);

        System.out.println(newMenu);
        System.out.println("item number two below >>>");
        System.out.println(menu2);
        newMenu.removeItem(menu2);
        System.out.println("After removing the itme 2");
        System.out.println(newMenu);

    }
}
