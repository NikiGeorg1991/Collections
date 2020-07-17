package Torti.Cake;

public class StandartCake extends Cake {

    boolean isSiroped = false;
    private StandartCakeType standartCakeType;

    public StandartCake(String name, int price, int pieces, boolean isSiroped) {
        super(name, price, pieces);
        this.isSiroped = isSiroped;
    }

    public static Cake generateBiscuiteCake() {
        return new StandartCake("Biskwitena", 5, 8, false);
    }
    public static Cake generateChocolateCake() {
        return new StandartCake("Shooko", 15, 16, false);
    }
    public static Cake generateFruitCake() {
        return new StandartCake("Plodova", 8, 6, false);
    }
    public static Cake generateEclerCake() {
        return new StandartCake("Eckler", 10, 10, true);
    }
}
