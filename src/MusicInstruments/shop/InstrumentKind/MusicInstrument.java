package MusicInstruments.shop.InstrumentKind;


public abstract class MusicInstrument implements Comparable<MusicInstrument> {

    private String name;
    private double price;
    private InstrumentKind kind;

    public MusicInstrument(String name, double price, InstrumentKind kind) {
        this.name = name;
        this.price = price;
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public InstrumentKind getKind() {
        return kind;
    }

    public void setKind(InstrumentKind kind) {
        this.kind = kind;
    }

    @Override
    public int compareTo(MusicInstrument o) {
        return Double.compare(this.getPrice(), o.getPrice());
    }

    @Override
    public String toString() {
        return "MusicInstrument{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", kind=" + kind +
                '}';
    }
}
