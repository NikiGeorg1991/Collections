package HomeworkCollections;

public class BathingTask extends Task implements ITask {

    public BathingTask(String name) {
        super(name);
    }

    @Override
    public void doWork() {
        System.out.println("banqm se");
    }
}
