package HomeworkCollections;

import java.util.Random;
import java.util.TreeSet;

public class Task implements Comparable<Task>, ITask {

    private String name;
    private TreeSet<ListeningTask> listeningTasks;


    public Task(String name) {
        this.name = name;
    }

    @Override
    public void doWork() {

    }

    Random r = new Random();

    public void addListeningTasks(ListeningTask listeningTask) {
        listeningTasks.add(listeningTask);
    }


    @Override
    public int compareTo(Task other) {
        return this.getName().compareTo(other.getName());
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                '}';
    }
}
