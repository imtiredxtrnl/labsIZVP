package Carshop.Cars;

public class Ford extends Car{
    public int year;
    public int manufacturerDiscount;

    public Ford(int speed, boolean isSellOut, double regularPrice, String color, int year, int manufacturerDiscount) {
        super(speed, isSellOut, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    @Override
    public double getSalePrice() {
        return regularPrice-manufacturerDiscount;
    }
}
