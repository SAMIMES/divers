package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //create a List of orders
        List<Order> orderList = new ArrayList<>();

        //fil the list
        orderList.add(new Order(1, Order.OrderType.BUY, 100.0, "phone"));
        orderList.add(new Order(2, Order.OrderType.SELL, 50.0, "mouse"));
        orderList.add(new Order(3, Order.OrderType.SELL, 150.0, "bike"));
        orderList.add(new Order(4, Order.OrderType.BUY, 500.0, "laptop"));
        orderList.add(new Order(5, Order.OrderType.SELL, 40.0, "keyboard"));

        //Before Java8
        //To select only sellOrders
        List<Order> sellOrderList = new ArrayList<>();

        for(Order o: orderList){
            if(o.getType() == Order.OrderType.SELL){
                sellOrderList.add(o);
            }
        }

        //get a sorted  product sellOrderList by price without using streams
        System.out.println("**** Without Streams ****");
        Collections.sort(sellOrderList,(o1,o2) -> o1.getPrice().compareTo(o2.getPrice()));

        List<String> products = new ArrayList<>();

        for(Order o: sellOrderList){
            products.add(o.getProduct());
            System.out.println(o.getProduct());
        }
        //Introducing Streams
        System.out.println("**** With Streams ****");
        List<String> products2 = orderList.stream()
                .filter(o->o.getType() == Order.OrderType.SELL)
                .sorted(Comparator.comparing(Order::getPrice))
                .map(Order::getProduct)
                .collect(Collectors.toList());








    }
}
