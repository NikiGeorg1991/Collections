package Torti.Cake;

import java.util.Comparator;

public class ComparatorByPrice implements Comparator<Cake> {

    @Override
    public int compare(Cake o1, Cake o2) {
        return o1.getPrice()-o2.getPrice();
    }
}
