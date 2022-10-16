package Runner;

public class DelayTaskRunner extends AbstractTaskRunner{

    public DelayTaskRunner(TaskRunner taskRunner) {
        super(taskRunner);
    }

    @Override
    public void executeOneTask() {
        try{
            Thread.sleep(3000);
            runner.executeOneTask();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
