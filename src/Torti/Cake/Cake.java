package Torti.Cake;

import java.util.Random;

public class Cake {

    private String name;
    private int price;
    private int pieces;
    private String description;
    private CakeType cakeType; //ne znam dali trqbwa da go ima

    public Cake(String name, int price, int pieces) {
        this.name = name;
        this.price = price;
        this.pieces = pieces;
    }

    public Cake generateCake() {
        double pickCake = Math.random();
        double pickGenCake = Math.random();
        if (pickCake <= 0.25) {
            if (pickGenCake <= 0.25) {
                return StandartCake.generateBiscuiteCake();
            }
            if ((pickGenCake > 0.25) && (pickGenCake <= 0.5)) {
                return StandartCake.generateChocolateCake();
            }
            if ((pickGenCake > 0.5) && (pickGenCake <= 0.75)) {
                return StandartCake.generateFruitCake();
            }
            if (pickGenCake > 0.75) {
                return StandartCake.generateEclerCake();
            }
        } else {
            if (pickCake > 0.25 && pickCake <= 0.5) {
                if (pickGenCake <= 0.33) {
                    return WeddingCake.generateMalkaCake();
                }
                if ((pickGenCake > 0.33) && (pickGenCake <= 0.66)) {
                    return WeddingCake.generateSrednaCake();
                }
                if (pickGenCake > 0.66) {
                    return WeddingCake.generateGolqmaCake();
                }
            } else {
                if (pickCake > 0.5 && pickCake <= 0.75) {
                    if (pickGenCake <= 0.33) {
                        return SpecialCake.generateYubileinaCake();
                    }
                    if ((pickGenCake > 0.33) && (pickGenCake <= 0.66)) {
                        return SpecialCake.generateADSCake();
                    }
                    if (pickGenCake > 0.66) {
                        return SpecialCake.generateFirmenaCake();
                    }
                } else {
                    if (pickCake > 0.75) {
                        if (pickGenCake <= 0.33) {
                            return ChildrenCake.generateBirthdayCake();
                        }
                        if ((pickGenCake > 0.33) && (pickGenCake <= 0.66)) {
                            return ChildrenCake.generateKryshteneCake();
                        }
                        if (pickGenCake > 0.66) {
                            return ChildrenCake.generateProshtapulnikCake();
                        }
                    }
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Cake{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", pieces=" + pieces +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPieces() {
        return pieces;
    }

    public void setPieces(int pieces) {
        this.pieces = pieces;
    }
}
