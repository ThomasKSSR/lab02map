package Container;

import Model.Task;

import java.util.Objects;

import static Utilis.Constants.INITIAL_STACK_SIZE;

public class StackContainer extends ContainerSup{


    public StackContainer() {
        super();
    }

    @Override
    public Task remove() {
        if(size != 0){
            size--;
            return tasks[size];
        }
        return null;
    }


}
