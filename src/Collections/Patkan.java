package Collections;

import java.lang.reflect.Parameter;

public class Patkan {

    private String name;
    private final int age = 22;

    public Patkan(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Patkan{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
