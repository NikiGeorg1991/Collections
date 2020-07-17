package Torti.Cake;

public class WeddingCake extends Cake {

    private int cakeFloors;// random to 4floors
    private WeddingCakeType weddingCakeType;

    public WeddingCake(String name, int price, int pieces, int cakeFloors) {
        super(name, price, pieces);
        this.cakeFloors = cakeFloors;
    }

    public static Cake generateSrednaCake() {
        return new WeddingCake("Sredna", 5, 8,5 );
    }
    public static Cake generateMalkaCake() {
        return new WeddingCake("Malka", 15, 16, 3);
    }
    public static Cake generateGolqmaCake() {
        return new WeddingCake("Golqma", 8, 6, 8);
    }
}
