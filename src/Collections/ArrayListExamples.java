package Collections;

import java.util.ArrayList;

public class ArrayListExamples {

    public static void main(String[] args) {

        Patkan patkan = new Patkan("Pedal");
        ArrayList list = new ArrayList();
        list.add("krawa");
        list.add("owca");
        list.add("kola");
        list.add("gyba");
        System.out.println("ArrayList with elements: " + list);
        System.out.println("the size is " + list.size());

        list.remove(1);
        System.out.println(list);
        System.out.println("the size is " + list.size());

        list.add(0,"gosho");
        System.out.println("ArrayList with elements: " + list);
        System.out.println("the size is " + list.size());

        list.add("gosho");
        System.out.println("ArrayList with elements: " + list);
        System.out.println("the size is " + list.size());

        list.add(patkan);

        System.out.println("ArrayList with elements: " + list);
        System.out.println("the size is " + list.size());
//        System.out.println
//        (list(5));
        list.set(1,"plami");
        System.out.println("ArrayList with elements: " + list);
        System.out.println("the size is " + list.size());

        System.out.println(list.contains("krawa"));


        ArrayList<String> buildings = new ArrayList();
        buildings.add("Empire state building");
        buildings.add("Burj Khalifa");
        buildings.add("Taipei 111");
        buildings.add("Eiffel tower");


//        list.add(buildings);
//        System.out.println("ArrayList with elements: " + list);
//        System.out.println("the size is " + list.size());

        list.addAll(buildings);
        System.out.println("ArrayList with elements: " + list);
        System.out.println("the size is " + list.size());





    }
}
