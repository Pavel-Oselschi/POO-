package second;

import first.Task;

// FIFO
public class Queue extends AbstractContainer {

    @Override
    public Task pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return tasks.remove(0);
    }
}
