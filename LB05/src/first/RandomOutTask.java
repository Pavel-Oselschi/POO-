package first;

import java.util.Random;

public class RandomOutTask implements Task {
    private int randomNumber;

    public RandomOutTask() {
        Random random = new Random();
        this.randomNumber = random.nextInt(100); // 0 - 99
    }

    @Override
    public void execute() {
        System.out.println("Număr aleator generat: " + randomNumber);
    }
}
