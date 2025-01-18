package fourth;

import first.Task;
import java.util.Calendar;

public class PrintTimeTaskRunner extends AbstractTaskRunner {

    @Override
    protected void afterExecution(Task task) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("Task-ul a fost executat la: " + calendar.getTime());
    }
}
