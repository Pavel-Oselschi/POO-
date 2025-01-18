package first;

public class CounterOutTask implements Task {
    private static int counter = 0; // Global counter

    @Override
    public void execute() {
        counter++;
        System.out.println("Contor: " + counter);
    }
}
