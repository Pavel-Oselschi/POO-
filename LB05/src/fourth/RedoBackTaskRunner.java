package fourth;

import first.Task;
import second.Container;
import third.ContainerFactory;
import third.Strategy;

public class RedoBackTaskRunner extends AbstractTaskRunner {
    private Container executedTasks;

    public RedoBackTaskRunner() {
        super();
        ContainerFactory factory = new ContainerFactory();
        executedTasks = factory.createContainer(Strategy.STACK);
    }

    @Override
    protected void afterExecution(Task task) {
        executedTasks.push(task);
        System.out.println("Task a fost salvat pentru reexecutare.");
    }

    public void redoAll() {
        System.out.println("Reexecutare taskuri...");
        while (!executedTasks.isEmpty()) {
            Task task = executedTasks.pop();
            task.execute();
        }
    }
}
