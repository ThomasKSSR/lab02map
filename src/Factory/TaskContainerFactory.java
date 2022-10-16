package Factory;

import Container.Container;
import Container.Strategy;
import Container.StackContainer;
import Container.QueueContainer;
public class TaskContainerFactory implements Factory{

    private static TaskContainerFactory single_TCF = null;

    private TaskContainerFactory() {
    }

    public static TaskContainerFactory TaskContainerFactory(){
        if(single_TCF == null){
            single_TCF = new TaskContainerFactory();

        }
        return single_TCF;
    }

    @Override
    public Container createContainer(Strategy strategy) {
        if(strategy == Strategy.LIFO){
            return new StackContainer();
        }
        if(strategy == Strategy.FIFO){
            return new QueueContainer();
        }
        return null;
    }
}
