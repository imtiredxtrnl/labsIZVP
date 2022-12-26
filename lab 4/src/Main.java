import ExtendedClasses.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<NewItem> itemList = new ArrayList<NewItem>();

        System.out.println("Old Bill");

        for(Integer i = 0; i < 10; i++) {
            NewItem item = new NewItem("Item "+ i.toString(),i*50);
            itemList.add(item);
        }

        NewBill testBill = new NewBill(itemList);
        System.out.println(testBill.printCheck());
        itemList.clear();

        System.out.println("New Bill");

        for(Integer i = 0; i < 10; i++) {
            NewItem itemDiscount = new NewItem("Item "+ i.toString(),i*50,i*5);
            itemList.add(itemDiscount);
        }

        NewBill testBillDiscount = new NewBill(itemList);

        System.out.println(testBillDiscount.printCheck(true));
        System.out.println(testBillDiscount.printCheck(false));
        System.out.println(testBillDiscount.printDiscount());
    }

}