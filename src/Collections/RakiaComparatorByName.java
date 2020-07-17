package Collections;

import java.util.Comparator;

public class RakiaComparatorByName implements Comparator<Rakia> {


    @Override
    public int compare(Rakia o1, Rakia o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
