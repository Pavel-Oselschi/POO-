package second;

import first.Task;

// LIFO
public class Stack extends AbstractContainer {

    @Override
    public Task pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return tasks.remove(tasks.size() - 1);
    }
}
