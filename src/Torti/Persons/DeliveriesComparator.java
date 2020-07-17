package Torti.Persons;

import java.util.Comparator;

public class DeliveriesComparator implements Comparator<DeliveryMan> {
    @Override
    public int compare(DeliveryMan o1, DeliveryMan o2) {

        if (o2.getMoney() == o1.getMoney()) {
            if (o2.getName().equals(o1.getName())) {
                o2.getPhoneNum().compareTo(o1.getPhoneNum());
            }
            return o2.getName().compareTo(o1.getName());
        }
        return (int) (o2.getMoney() - o1.getMoney());
    }
}
