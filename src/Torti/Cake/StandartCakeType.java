package Torti.Cake;

public enum StandartCakeType {

    BISCUIT((int) Math.random() * 10 + 1),
    ECLER((int) Math.random() * 10 + 1),
    FRUIT((int) Math.random() * 10 + 1),
    CHOCOLATE((int) Math.random() * 10 + 1);

    private int capacity;

    public int getCapacity() {
        return capacity;
    }

    StandartCakeType(int capacity) {
        this.capacity = capacity;
    }
}
