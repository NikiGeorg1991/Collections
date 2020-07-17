package Torti;

import Torti.Cake.Cake;
import Torti.Persons.DeliveryMan;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {

        Candyshop sladkiTalanti = new Candyshop("Sladki Talanti");

        sladkiTalanti.deliverys.add(new DeliveryMan("Gosho", "555-921", 100));
        sladkiTalanti.deliverys.add(new DeliveryMan("Pesho", "555-922", 90));
        sladkiTalanti.deliverys.add(new DeliveryMan("Deso", "555-923", 110));
        sladkiTalanti.deliverys.add(new DeliveryMan("Tosho", "555-924", 120));
        sladkiTalanti.deliverys.add(new DeliveryMan("Bosho", "555-955", 80));

        for (Iterator it = sladkiTalanti.deliverys.iterator(); it.hasNext(); ) {
            System.out.println(it.next());
        }

        sladkiTalanti.add30Cakes();
    }
}
