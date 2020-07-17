package Collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class QueueExamples {

    public static void main(String[] args) {


        Queue<String> opashka = new LinkedList<>();
        opashka.add("kifte");
        opashka.add("kibapchi");
        opashka.add("hlqb");
        opashka.add("kokoshka");

        System.out.println(opashka);
        System.out.println(opashka.offer("med"));
        System.out.println(opashka);

        System.out.println(opashka.element());
        System.out.println(opashka);

        System.out.println(opashka.peek());
        System.out.println(opashka);

        System.out.println(opashka.poll());
        System.out.println(opashka);

        System.out.println(opashka.peek());
        System.out.println(opashka);
    }
}
