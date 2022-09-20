package com.kravchenko;

public class Item {
    public String itemName;
    public double itemPrice;

    public Item(String name, double price) {
        itemName = name;
        if(price<0){
            itemPrice = 0;
        } else {
            itemPrice = price;
        }
    }

    public void riseByPercent(float percent) {
        if(percent>=0 && percent<=100) {
            double riseChange = itemPrice/100 * percent;
            itemPrice += riseChange;
        }
    }

    public void decreaseByPercent(float percent) {
        if(percent>=0 && percent<=100) {
            double riseChange = itemPrice/100 * percent;
            itemPrice -= riseChange;
        }
    }
}