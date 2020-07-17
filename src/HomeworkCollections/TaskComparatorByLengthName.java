package HomeworkCollections;

import java.util.Comparator;

public class TaskComparatorByLengthName implements Comparator<Task> {
    @Override
    public int compare(Task o1, Task o2) {
        return o2.getName().length()-o1.getName().length();
    }
}
