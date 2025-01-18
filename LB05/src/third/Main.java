package third;


import second.Container;
import first.*;

public class Main {
    public static void main(String[] args) {
        ContainerFactory factory = new ContainerFactory();

        Container stackContainer = factory.createContainer(Strategy.STACK);
        Container queueContainer = factory.createContainer(Strategy.QUEUE);

        Task task1 = new OutTask("Afisare mesaj din OutTask");
        Task task2 = new RandomOutTask();
        Task task3 = new CounterOutTask();

        stackContainer.push(task1);
        stackContainer.push(task2);
        stackContainer.push(task3);

        queueContainer.push(task1);
        queueContainer.push(task2);
        queueContainer.push(task3);

        System.out.println("Executare din Stack (LIFO):");
        stackContainer.pop().execute();  // Task 3
        stackContainer.pop().execute();  // Task 2
        stackContainer.pop().execute();  // Task 1

        System.out.println("\nExecutare din Queue (FIFO):");
        queueContainer.pop().execute();  // Task 1
        queueContainer.pop().execute();  // Task 2
        queueContainer.pop().execute();  // Task 3
    }
}
