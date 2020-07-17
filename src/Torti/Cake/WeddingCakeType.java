package Torti.Cake;

public enum WeddingCakeType {

    BIG((int) Math.random() * 10 + 1),NORMAL((int) Math.random() * 10 + 1),LITTLE((int) Math.random() * 10 + 1);
    private int capacity;

    public int getCapacity() {
        return capacity;
    }

    WeddingCakeType(int capacity) {
        this.capacity = capacity;
    }
}
