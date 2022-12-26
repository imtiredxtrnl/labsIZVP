package Carshop.Impl;

import Carshop.Cars.Car;
import Carshop.Interface.Admin;
import Carshop.Interface.Customer;

import java.util.ArrayList;

public class MyOwnAutoShop implements Admin, Customer {
    public ArrayList<Car> listOfCars;

    public MyOwnAutoShop(ArrayList<Car> listOfCars) {
        this.listOfCars = listOfCars;
    }

    @Override
    public int getIncome() {
        double sum = 0;
        for(Car c : listOfCars) {
           if(c.isSellOut) {
               sum += c.getSalePrice();
           }
        }
        return (int)sum;
    }

    @Override
    public String getCarsPrice() {
        StringBuilder endResult = new StringBuilder();
        int iterator = 0;
        for(Car c : listOfCars) {
            endResult.append(c.getSalePrice());
            endResult.append(" ");
        }
        return endResult.toString();
    }

    @Override
    public String getCarColors() {
        StringBuilder endResult = new StringBuilder();
        int iterator = 0;
        for(Car c : listOfCars) {
            endResult.append(c.color);
            endResult.append(" ");
            iterator++;
        }
        return endResult.toString();
    }

    @Override
    public int getCarPrice(int id) {
        Car c = listOfCars.get(id-1);
        return (int)c.getSalePrice();
    }

    @Override
    public String getCarColor(int id) {
        Car c = listOfCars.get(id-1);
        return c.color;
    }

    @Override
    public boolean purchaseCar(int id) {
        Car c = listOfCars.get(id-1);
        return c.isSellOut;
    }
}