package fourth;

import first.Task;
import first.OutTask;
import first.RandomOutTask;
import first.CounterOutTask;

public class Main {
    public static void main(String[] args) {
        Task task1 = new OutTask("Afisare mesaj din OutTask");
        Task task2 = new RandomOutTask();
        Task task3 = new CounterOutTask();


        System.out.println("\nPrintTimeTaskRunner:");
        PrintTimeTaskRunner timeRunner = new PrintTimeTaskRunner();
        timeRunner.addTask(task1);
        timeRunner.addTask(task2);
        timeRunner.addTask(task3);
        timeRunner.executeAll();


        System.out.println("\nCounterTaskRunner:");
        CounterTaskRunner counterRunner = new CounterTaskRunner();
        counterRunner.addTask(task1);
        counterRunner.addTask(task2);
        counterRunner.addTask(task3);
        counterRunner.executeAll();


        System.out.println("\nRedoBackTaskRunner:");
        RedoBackTaskRunner redoRunner = new RedoBackTaskRunner();
        redoRunner.addTask(task1);
        redoRunner.addTask(task2);
        redoRunner.addTask(task3);
        redoRunner.executeAll();
        redoRunner.redoAll();
    }
}
