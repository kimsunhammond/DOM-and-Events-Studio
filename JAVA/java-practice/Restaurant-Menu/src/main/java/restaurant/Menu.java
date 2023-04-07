package restaurant;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

        //TODO: declare two private fields, menuItems (ArrayList<MenuItem>) and lastUpdated (Date)

    public static void main(String[] args) {

        ArrayList<MenuItem> menuItems = new ArrayList<>();
        Date lastUpdated;

        //create menu items
        MenuItem soup = new MenuItem("french onion soup", 5, "appetizer", true);
        MenuItem salad = new MenuItem("caesar salad", 10, "appetizer", true);
        MenuItem chicken = new MenuItem("grilled chicken", 18, "main course", false);
        MenuItem cookie = new MenuItem("chocolate chip cookie", 3, "dessert", true);

        //add items to the menu
        menuItems.add(soup);
        menuItems.add(salad);
        menuItems.add(chicken);
        menuItems.add(cookie);

        //public String toString() {
        //   return menuItems = " Item: " + description ", " + price ", " + category ", " + isNew;
        //}

        Menu menuItem = new Menu();
        lastUpdated = new Date();
        
        for (MenuItem item : menuItems){
        System.out.println("The "+ item.getDescription() + " costs " + item.getPrice() + ". Item updated on " + item.getDateAdded());
    }
}
}


