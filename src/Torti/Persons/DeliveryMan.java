package Torti.Persons;

import Torti.Order;

import java.util.Set;
import java.util.TreeSet;

public class DeliveryMan extends Person {


    Set<Order> orders = new TreeSet<Order>();


    public DeliveryMan(String name, String phoneNum, double money) {
        super(name, phoneNum, money);
    }


}
