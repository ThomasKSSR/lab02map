package Runner;

import Container.Container;
import Container.Strategy;
import Model.Task;
import Factory.TaskContainerFactory;

public class StrategyTaskRunner implements TaskRunner{

    private Container container;

    public StrategyTaskRunner(Strategy strategy) {
        this.container = TaskContainerFactory.TaskContainerFactory().createContainer(strategy);

    }

    @Override
    public void executeOneTask() {
        if(!container.isEmpty()) {
            Task task = container.remove();
            task.execute();
        }
    }

    @Override
    public void executeAll() {
        while(!container.isEmpty()){
            Task task = container.remove();
            task.execute();
        }
    }

    @Override
    public void addTask(Task t) {
        container.add(t);
    }

    @Override
    public boolean hasTask() {
        return !container.isEmpty();
    }
}
