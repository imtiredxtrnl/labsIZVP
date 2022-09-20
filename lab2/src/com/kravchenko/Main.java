package com.kravchenko;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Cart cartInUse = new Cart(6);
        for(int i = 0; i < 5; i++){
            BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));

            System.out.print("Введите название предмета: ");
            String nameOfItem = reader.readLine();
            System.out.print("Введите цену товара: ");
            String priceOfItem = reader.readLine();
            Item cartPiece = new Item(nameOfItem,Double.parseDouble(priceOfItem));

            cartInUse.addItemToCart(cartPiece);
        }
        double sumPriceForItems = cartInUse.sumOfAllPrices();
        System.out.println("Цена на все позиции составляет: " + sumPriceForItems);

        cartInUse.upAllItemsByPercent(15);
        sumPriceForItems = cartInUse.sumOfAllPrices();
        System.out.println("Цена за все после повышения на 15%: " + sumPriceForItems);

        cartInUse.downAllItemsByPercent(30);
        sumPriceForItems = cartInUse.sumOfAllPrices();
        System.out.println("Цена за все после повышения на 30%: " + sumPriceForItems);
    }
}