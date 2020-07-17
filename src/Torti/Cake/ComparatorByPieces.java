package Torti.Cake;

import java.util.Comparator;

public class ComparatorByPieces implements Comparator<Cake> {
    @Override
    public int compare(Cake o1, Cake o2) {
        return o1.getPieces() - o2.getPieces();
    }
}
