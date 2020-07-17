package HomeworkCollections;

import java.util.Comparator;

public class TaskComparatorByName implements Comparator<Task> {
    @Override
    public int compare(Task o1, Task o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
