package fourth;

import first.Task;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractTaskRunner {
    protected List<Task> tasks;

    public AbstractTaskRunner() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void executeAll() {
        for (Task task : tasks) {
            task.execute();
            afterExecution(task);
        }
    }

    protected abstract void afterExecution(Task task);
}
