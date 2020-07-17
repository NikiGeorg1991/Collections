package Torti;

import Torti.Cake.Cake;
import Torti.Persons.Client;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private Client client;
    private double price;
    private String adress;
    List<Cake> cakes = new ArrayList<Cake>();
    private LocalDateTime deliveryTime = LocalDateTime.now();


}
