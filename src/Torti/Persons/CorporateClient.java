package Torti.Persons;

import Torti.Cake.*;

import java.util.Random;

public class CorporateClient extends Client {

    private final static double ORDER_DISCOUNT = 0.1;

    public CorporateClient(String name, String phoneNum, double money) {
        super(name, phoneNum, money);

    }

    @Override
    public void makeOrder() {

    }
}
