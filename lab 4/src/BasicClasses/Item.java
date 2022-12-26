package BasicClasses;

public class Item {

    public String itemName;
    public double itemPrice;

    public Item() {
        this.itemName = "Name";
        this.itemPrice = 100.00;
    }

    public Item(String name, double price) {
        this.itemName = name;
        this.itemPrice = price;
    }

    public void changePrice(double newPrice) {
        this.itemPrice = newPrice;
    }

    public void changeName(String newName) {
        this.itemName = newName;
    }
}
