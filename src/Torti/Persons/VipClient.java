package Torti.Persons;

import java.util.Random;

public class VipClient extends Client {

    private int numberVauchers;
    private int valueVauchers;
    private final static int VAUCHERS_MAX_VALUE = 30;
    private final static int VAUCHERS_MIN_VALUE = 10;
    private final static int VAUCHERS_MAX_NUMBER = 4;
    private final static int VAUCHERS_MIN_NUMBER = 1;


    Random r = new Random();


    public VipClient(String name, String phoneNum, double money) {
        super(name, phoneNum, money);
        this.numberVauchers = r.nextInt(VAUCHERS_MAX_NUMBER - VAUCHERS_MIN_NUMBER) + VAUCHERS_MIN_NUMBER;
        this.valueVauchers = r.nextInt(VAUCHERS_MAX_VALUE - VAUCHERS_MIN_VALUE) + VAUCHERS_MIN_VALUE;
    }

    @Override
    public void makeOrder() {

    }
}
