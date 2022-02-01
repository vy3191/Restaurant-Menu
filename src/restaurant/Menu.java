package restaurant;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    ArrayList<MenuItem> items;
    private Date lastUpdated;

    public Menu() {
        this.lastUpdated = new Date();
        this.items = new ArrayList<>();
    }

    public Menu(ArrayList<MenuItem> items) {
        this();
        this.items.addAll(items);
    }

    public boolean addItem(MenuItem item) {
        if(item != null && !this.items.contains(item)) {
            this.items.add(item);
            this.lastUpdated = new Date();
            return true;
        }
        System.out.println("Duplicates are not allowed");
        return false;
    }

    public boolean removeItem(MenuItem item) {
        boolean result = this.items.remove(item);

        if(result) {
            this.lastUpdated = new Date();
        }
        return result;
    }

    public Date getLastUpdated() {

        return lastUpdated;
    }

    public String getLastUpdatedFormat() {
        SimpleDateFormat simpleDate = new SimpleDateFormat("EEE, MMM d, YYYY");
        return simpleDate.format(this.lastUpdated);
    }

    public ArrayList<MenuItem> getItems() {
        return this.items;
    }

    @Override
    public String toString() {
        StringBuffer itemStr = new StringBuffer();
        for(MenuItem item : items) {
            itemStr.append(item+ "\n");
        }
        return "Menu{" + "items=" + itemStr + ","+"\n" +" lastUpdated=" + this.getLastUpdatedFormat() + '}';
    }
}
