package BasicClasses;

import java.util.*;

public class Bill {
    protected List<Item> itemsBill;

    public Bill() {
        itemsBill = new ArrayList<Item>();
    }

    public Bill(ArrayList items) {
        itemsBill = new ArrayList<Item>();
        for (Object i : items) {
            itemsBill.add((Item) i);
        }
    }

    public String printCheck() {
        Double sum = 0.0;
        for (Item i : itemsBill) {
            sum += i.itemPrice;
        }
        String result = "Your total sum is:";
        return result.concat(sum.toString());
    }

    public void addItem(Item i) {
        itemsBill.add(i);
    }
}
