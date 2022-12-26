package ExtendedClasses;

import BasicClasses.Bill;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.*;

public class NewBill extends Bill {
   protected List<NewItem> itemsBill;

    public NewBill() {
        itemsBill = new ArrayList<NewItem>();
    }

    public NewBill(ArrayList<NewItem> items) {
        super(items);
    }

    public String printCheck(boolean flag) {
        if (flag) {
            return printCheckForOld();
        } else {
            return printCheck();
        }
    }

    private @NotNull String printCheckForOld() {
        double sum = 0.0, discount = 0.0;
        for (NewItem i : itemsBill) {
            sum += i.itemPrice;
            discount += i.discount;
        }
        String result = "Your total sum is:";
        return result.concat(Double.toString(sum - discount));
    }
    public String printDiscount() {
        double discount = 0.0;
        for(NewItem i: itemsBill) {
            discount += i.discount;
        }
        return "Total discount is " + Double.toString(discount);
    }
}
