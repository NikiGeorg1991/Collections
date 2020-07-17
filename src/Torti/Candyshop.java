package Torti;

import Torti.Cake.*;
import Torti.Persons.DeliveriesComparator;
import Torti.Persons.DeliveryMan;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Candyshop {

    private String name;
    private String adress;
    private String phoneNum;
    Set<DeliveryMan> deliverys = new TreeSet<DeliveryMan>(new DeliveriesComparator());
    ArrayList<Cake> cakes = new ArrayList<>();


    public Candyshop(String name) {
        this.name = name;
//        Set<StandartCake> standartCakes = new TreeSet<>(new ComparatorByPrice());
//        Set<SpecialCake> specialCakes = new TreeSet<>(new ComparatorByPrice());
//        Set<ChildrenCake> childrenCakes = new TreeSet<>(new ComparatorByPieces());
//        Set<WeddingCake> weddingCakes = new TreeSet<>(new ComparatorByPieces());
    }

    public void add30Cakes() {
        for (int i = 0; i < 30; i++) {
            double pickCake = Math.random();
            double pickGenCake = Math.random();
            if (pickCake <= 0.25) {
                if (pickGenCake <= 0.25) {
                    this.cakes.add(StandartCake.generateBiscuiteCake());
                }
                if ((pickGenCake > 0.25) && (pickGenCake <= 0.5)) {
                    this.cakes.add(StandartCake.generateChocolateCake());
                }
                if ((pickGenCake > 0.5) && (pickGenCake <= 0.75)) {
                    this.cakes.add(StandartCake.generateFruitCake());
                }
                if (pickGenCake > 0.75) {
                    this.cakes.add(StandartCake.generateEclerCake());
                }
            } else {
                if (pickCake > 0.25 && pickCake <= 0.5) {
                    if (pickGenCake <= 0.33) {
                        this.cakes.add(WeddingCake.generateMalkaCake());
                    }
                    if ((pickGenCake > 0.33) && (pickGenCake <= 0.66)) {
                        this.cakes.add(WeddingCake.generateSrednaCake());
                    }
                    if (pickGenCake > 0.66) {
                        this.cakes.add(WeddingCake.generateGolqmaCake());
                    }
                } else {
                    if (pickCake > 0.5 && pickCake <= 0.75) {
                        if (pickGenCake <= 0.33) {
                            this.cakes.add(SpecialCake.generateYubileinaCake());
                        }
                        if ((pickGenCake > 0.33) && (pickGenCake <= 0.66)) {
                            this.cakes.add(SpecialCake.generateADSCake());
                        }
                        if (pickGenCake > 0.66) {
                            this.cakes.add(SpecialCake.generateFirmenaCake());
                        }
                    } else {
                        if (pickCake > 0.75) {
                            if (pickGenCake <= 0.33) {
                                this.cakes.add(ChildrenCake.generateBirthdayCake());
                            }
                            if ((pickGenCake > 0.33) && (pickGenCake <= 0.66)) {
                                this.cakes.add(ChildrenCake.generateKryshteneCake());
                            }
                            if (pickGenCake > 0.66) {
                                this.cakes.add(ChildrenCake.generateProshtapulnikCake());
                            }
                        }
                    }
                }
            }
            System.out.println(this.cakes.get(i));
        }
    }
}
