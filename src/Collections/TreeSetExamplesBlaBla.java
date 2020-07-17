package Collections;

import java.util.TreeSet;

public class TreeSetExamplesBlaBla {

    public static void main(String[] args) {

//        TreeSet<String> treeSet = new TreeSet<>();
//        treeSet.add("Pesho");
//        treeSet.add("Rumen");
//        treeSet.add("Petyo");
//        treeSet.add("Niki");
//        treeSet.add("Stenki");
//        treeSet.add("Dido");
//        treeSet.add("Mimi");
//
//        System.out.println(treeSet);
//
//        TreeSet<Integer> treeSetInt = new TreeSet<>();
//        treeSetInt.add(6);
//        treeSetInt.add(4);
//        treeSetInt.add(15);
//        treeSetInt.add(551);
//        treeSetInt.add(21);
//        treeSetInt.add(15);
//
//        System.out.println(treeSetInt);

        TreeSet<Rakia> treeSetByGradus = new TreeSet<>(new RakiaCompataratorByGradus());

        Rakia grozdowa = new Rakia("Grozdowa", 44);
        Rakia krushowa = new Rakia("Krushuwa", 55);
        Rakia qbylkowa = new Rakia("Qbylkowa", 66);
        Rakia malinova = new Rakia("Malinova", 33);

        treeSetByGradus.add(grozdowa);
        treeSetByGradus.add(krushowa);
        treeSetByGradus.add(qbylkowa);
        treeSetByGradus.add(malinova);

        System.out.println(treeSetByGradus);

        TreeSet<Rakia> treeSetByName = new TreeSet<>(new RakiaComparatorByName());
        treeSetByName.add(grozdowa);
        treeSetByName.add(krushowa);
        treeSetByName.add(qbylkowa);
        treeSetByName.add(malinova);
        System.out.println(treeSetByName);

    }
}
