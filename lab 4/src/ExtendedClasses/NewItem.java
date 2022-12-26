package ExtendedClasses;

import BasicClasses.Item;

public class NewItem extends Item {

    public double discount;

    public NewItem() {
        super();
        discount = 0;
    }

    public NewItem(String name, double price) {
        super(name, price);
        discount = 0;
    }

    public NewItem(double discount) {
        super();
        this.discount = discount;
    }

    public NewItem(String name, double price, double discount) {
        super(name,price);
        this.discount = discount;
    }

    public void changeDiscount(double newDiscount) {
        this.discount = newDiscount;
    }
}
