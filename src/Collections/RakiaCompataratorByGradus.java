package Collections;

import java.util.Comparator;

public class RakiaCompataratorByGradus implements Comparator<Rakia> {
    @Override
    public int compare(Rakia o1, Rakia o2) {
        return o1.getGradus() - o2.getGradus();
    }
}
