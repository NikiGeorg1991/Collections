package Torti.Cake;

public enum ChildrenCakeType {

    BIRTHDAY((int) Math.random() * 10 + 1), KRYSHTENE((int) Math.random() * 10 + 1), PROSHTAPUNIK((int) Math.random() * 10 + 1);

    private int capacity;

    public int getCapacity() {
        return capacity;
    }

    ChildrenCakeType(int capacity) {
        this.capacity = capacity;
    }
}
