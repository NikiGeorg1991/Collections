package Collections;

public class Rakia implements Comparable<Rakia> {

    private String name;
    private int gradus;

    public Rakia(String name, int gradus) {
        this.name = name;
        this.gradus = gradus;
    }

    public String getName() {
        return name;
    }

    public int getGradus() {
        return gradus;
    }


    @Override
    public int compareTo(Rakia other) {
        return this.gradus - other.gradus;
    }

    @Override
    public String toString() {
        return "Rakia{" +
                "name='" + name + '\'' +
                ", gradus=" + gradus +
                '}';
    }
}
