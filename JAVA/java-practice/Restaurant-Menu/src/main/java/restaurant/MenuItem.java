package restaurant;

import java.util.Date;

public class MenuItem {
    //private final Object Date;
    //TODO: declare private fields (variables)
    private String description;
    private double price;
    private String category;
    private boolean isNew;
    private Date dateAdded;

    //TODO: define constructor to take values for the fields as params
    //initialize dateAdded as the current date
    public MenuItem(String description, double price, String category, boolean isNew) {
        this.description = description;
        this.price = price;
        this.category = category;
        this.isNew = isNew;
        //call the Date constructor in as empty (just calls in the current date); when we create and object of the menu item class and feed these in, it will run the Date as a method
        this.dateAdded = new Date();
    }

    //public String toString() {
    //    return "category + description + price + isNew";
    //}

    //Methods
    // TODO: Define Getters and setters
    public void setDescription(String description) { this.description = description; }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setNew(boolean aNew) { isNew = aNew; }

    public void setDate(Date newDate) {
        //    this.newDate = newDate;
    }
    //public String setDate() {


    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public Date getDateAdded() {
        return dateAdded;
    }
//public void addMenuItem(MenuItem menuItem) {
//        this.items.add(MenuItem);
}






