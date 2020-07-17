package Torti.Cake;

public class ChildrenCake extends Cake {

    private ChildrenCakeType childrenCakeType;
    private String childName; //ne sym siguren che trqbwa da go ima

    public ChildrenCake(String name, int price, int pieces, String childName) {
        super(name, price, pieces);
        this.childName=childName;
    }

    public static Cake generateBirthdayCake() {
        return new ChildrenCake("Bday", 5, 8, "Tea");
    }
    public static Cake generateKryshteneCake() {
        return new ChildrenCake("Kryshtene", 15, 16, "Dea");
    }
    public static Cake generateProshtapulnikCake() {
        return new ChildrenCake("Proshtapulnik", 8, 6, "Bea");
    }

}
