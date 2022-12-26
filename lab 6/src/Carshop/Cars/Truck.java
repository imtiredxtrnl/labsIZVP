package Carshop.Cars;

public class Truck extends Car {
    public int weight;

    public Truck(int speed, boolean isSellOut, double regularPrice, String color, int weight) {
        super(speed, isSellOut, regularPrice, color);
        this.weight = weight;
    }

    @Override
    public double getSalePrice() {
        int maxWeight = 2000;
        if(weight >= maxWeight) {
            return regularPrice - (regularPrice/10);
        }
        return regularPrice;
    }
}
