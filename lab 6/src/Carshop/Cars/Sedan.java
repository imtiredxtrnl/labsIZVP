package Carshop.Cars;

public class Sedan extends Car{
   public int length;

   public Sedan(int speed, boolean isSellOut, double regularPrice, String color, int length) {
       super(speed, isSellOut, regularPrice, color);
       this.length = length;
   }

    @Override
    public double getSalePrice() {
       int maxLength = 20;
        if(length >= maxLength) {
            return regularPrice - regularPrice/20;
        }
        return regularPrice;
    }
}
