package third;

import second.Container;
import second.Stack;
import second.Queue;

public class ContainerFactory implements IFactory {

    @Override
    public Container createContainer(Strategy strategy) {
        switch (strategy) {
            case STACK:
                return new Stack();
            case QUEUE:
                return new Queue();
            default:
                throw new IllegalArgumentException("Strategie necunoscută: " + strategy);
        }
    }
}
