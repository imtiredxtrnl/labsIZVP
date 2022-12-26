import Carshop.Cars.Car;
import Carshop.Cars.Ford;
import Carshop.Cars.Sedan;
import Carshop.Cars.Truck;
import Carshop.Impl.MyOwnAutoShop;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> myArrayList = new ArrayList<Car>();
        Car firstCar =  new Ford(100,false,25000,"green",2012,1500);
        Car secondCar = new Sedan(130,true,20000,"black",32);
        Car thirdCar = new Truck(90,false,15000,"blue",4200);
        myArrayList.add(firstCar);
        myArrayList.add(secondCar);
        myArrayList.add(thirdCar);
        MyOwnAutoShop myShop = new MyOwnAutoShop(myArrayList);
        System.out.println(myShop.getCarColors());
        System.out.println(myShop.purchaseCar(1));
        System.out.println(myShop.getCarPrice(2));
        System.out.println(myShop.getCarsPrice().toString());
     }
}