package Runner;

import java.time.LocalDateTime;

import static Utilis.Constants.DATE_TIME_FORMATTER;

public class PrinterTaskRunner extends AbstractTaskRunner{
    public PrinterTaskRunner(TaskRunner taskRunner) {
        super(taskRunner);
    }


    @Override
    public void executeOneTask() {
        runner.executeOneTask();
        decorateExecuteOneTask();

    }

    private void decorateExecuteOneTask(){
        System.out.println("Task executat la " + LocalDateTime.now().format(DATE_TIME_FORMATTER));
    }
}
