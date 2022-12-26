package Carshop.Cars;

public abstract class Car {
    public int speed;
    public boolean isSellOut;
    public double regularPrice;
    public String color;
    public Car(int speed, boolean isSellOut, double regularPrice, String color) {
        this.speed = speed;
        this.isSellOut = isSellOut;
        this.regularPrice = regularPrice;
        this.color = color;
    }
    public double getSalePrice() {
        return regularPrice;
    };
}
