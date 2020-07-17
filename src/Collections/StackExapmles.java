package Collections;

import java.util.Stack;

public class StackExapmles {

    public static void main(String[] args) {

        Stack<String> bidon = new Stack<>();

        bidon.push("zele");
        bidon.push("domat");
        bidon.push("chushka");
        bidon.push("rqpa");
        bidon.push("morkov");

        System.out.println(bidon);

        System.out.println(bidon.peek());
        System.out.println(bidon);

        System.out.println(bidon.pop());
        System.out.println(bidon);
    }
}
