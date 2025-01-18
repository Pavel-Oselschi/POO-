package second;

import first.Task;

public interface Container {
    void push(Task task);
    Task pop();
    int size();
    boolean isEmpty();
    void transferFrom(Container container);
}
