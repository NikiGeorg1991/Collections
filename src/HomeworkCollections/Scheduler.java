package HomeworkCollections;

import java.util.LinkedList;


public class Scheduler implements ITask {

    private LinkedList<ITask> tasks = new LinkedList<ITask>();

    public void push(ITask task){
        this.tasks.add(task);
    }

    public void bazowMethodMain(){
        ITask currentTask = tasks.getFirst();
        if(currentTask == null){
            System.out.println("ERROR! ");
        }
        else {
            currentTask.doWork();
            currentTask=tasks.remove();
        }
    }

    @Override
    public void doWork() {

    }
}
