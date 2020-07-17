package HomeworkCollections;

public class SmokingTask extends  Task implements ITask {


    public SmokingTask(String name) {
        super(name);
    }

    @Override
    public void doWork() {
        System.out.println("Smoke weed everyday la la la");
    }
}
