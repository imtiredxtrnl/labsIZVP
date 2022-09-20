package com.kravchenko;
import java.util.ArrayList;
import java.util.List;

public class Cart {
    public List<Item> listOfItems;
    public int maxCapacity;

    public Cart(int length){
        listOfItems = new ArrayList<Item>(length);
        maxCapacity = length;
    }

    public double sumOfAllPrices(){
        double sum = 0;
        for (Item it:listOfItems) {
            sum += it.itemPrice;
        }
        return sum;
    }

    public void addItemToCart(Item item ) {
        listOfItems.add(item);
    }

    public void removeItemFromCart(Item item ) {
        listOfItems.remove(item);
    }

    public void upAllItemsByPercent(float percent) {
        for (Item it:listOfItems) {
            it.riseByPercent(percent);
        }
    }

    public void downAllItemsByPercent(float percent) {
        for (Item it:listOfItems) {
            it.decreaseByPercent(percent);
        }
    }
}