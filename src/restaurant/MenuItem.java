package restaurant;
import java.util.Date;
import java.util.Objects;

public class MenuItem {
    private static final int NEW_DAYS = 30;
    private static final long MILLISECUNS_IN_DAY = 1000 * 60 * 60 * 24;

    private static int numberOfItems = 0;


    private String description;
    private double price;
    private int itemId;
    private String category;
    private Date startDate = new Date();


    public MenuItem(String aDescription, double aPrice, String aCategory, Date aStartDate) {
        this.description = aDescription;
        this.price = aPrice;
        this.itemId = numberOfItems++;
        this.category = aCategory;
        this.startDate = aStartDate;
    }

    public MenuItem(String aDescription, double aPrice, String aCategory) {
        this.description = aDescription;
        this.price = aPrice;
        this.itemId = numberOfItems++;
        this.category = aCategory;
    }



    public boolean isNew() {
        return ((new Date().getTime() - this.startDate.getTime()) / MILLISECUNS_IN_DAY) < NEW_DAYS;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", itemId='" + itemId + '\'' +
                ", isNew=" + isNew() +
                ", category='" + category + '\'' +
                ", startDate=" + startDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Double.compare(menuItem.price, price) == 0 && description.equals(menuItem.description) && category.equals(menuItem.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, price, category);
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getItemId() {
        return itemId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
