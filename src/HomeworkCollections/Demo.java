package HomeworkCollections;

import java.util.Random;
import java.util.TreeSet;

public class Demo {

    public static void main(String[] args) {

        Scheduler scheduler = new Scheduler();

        Random r = new Random();

        Task bathhing = new BathingTask("CHipam se");
        Task smoking = new SmokingTask("smOKING MADA FAKA");
        Task listening = new ListeningTask("liSTENING LA LA LA");

        scheduler.push(bathhing);
        scheduler.push(smoking);
        scheduler.push(listening);

        scheduler.bazowMethodMain();
        scheduler.bazowMethodMain();
        scheduler.bazowMethodMain();

        System.out.println("TreeSet MAgic");
        TreeSet<Task> setByName = new TreeSet<Task>(new TaskComparatorByName());
        setByName.add(bathhing);
        setByName.add(smoking);
        setByName.add(listening);

        System.out.println(setByName);

        System.out.println("======================");

        TreeSet<Task> setByLength = new TreeSet<>(new TaskComparatorByLengthName());
        setByLength.add(bathhing);
        setByLength.add(smoking);
        setByLength.add(listening);

        System.out.println(setByLength);


    }
}
