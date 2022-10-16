package Container;

import Model.Task;

public class QueueContainer extends ContainerSup{

    public QueueContainer() {
        super();
    }

    @Override
    public Task remove() {
        if(size != 0){
            Task t = tasks[0];
            for(int i=0;i<size;i++){
                tasks[i]=tasks[i+1];
            }
            size--;
            return t;
        }
        return null;
    }
}
