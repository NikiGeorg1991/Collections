package Torti.Cake;

public enum SpecialCakeType {

    ANNIVERSARY((int) Math.random() * 10 + 1), FIRM((int) Math.random() * 10 + 1), ADS((int) Math.random() * 10 + 1);
    private int capacity;

    public int getCapacity() {
        return capacity;
    }

    SpecialCakeType(int capacity) {
        this.capacity = capacity;
    }
}
