package HomeworkCollections;

import java.util.Random;
import java.util.TreeSet;

public class ListeningTask extends Task implements ITask {

    private String name = "listening";

    public ListeningTask(String name) {
        super(name);
    }




    @Override
    public void doWork() {
        System.out.println("bla bla bla ");
    }
}
