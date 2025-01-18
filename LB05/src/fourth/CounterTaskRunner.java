package fourth;

import first.Task;

public class CounterTaskRunner extends AbstractTaskRunner {
    private int counter;

    public CounterTaskRunner() {
        super();
        counter = 0;
    }

    @Override
    protected void afterExecution(Task task) {
        counter++;
        System.out.println("Task executat numărul: " + counter);
    }
}
