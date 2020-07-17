package Torti.Cake;

public class SpecialCake extends Cake {

    private SpecialCakeType specialCakeType;
    private String nameOfEvent; //ne sym siguren che trqbwa da go ima

    public SpecialCake(String name, int price, int pieces, String nameOfEvent) {
        super(name, price, pieces);
        this.nameOfEvent = nameOfEvent;
    }

    public static Cake generateYubileinaCake() {
        return new SpecialCake("Yubileina", 5, 8, "Yubileina");
    }

    public static Cake generateFirmenaCake() {
        return new SpecialCake("Firmena", 15, 16, "Firmena");
    }

    public static Cake generateADSCake() {
        return new SpecialCake("ADS", 8, 6, "ADS");
    }
}
