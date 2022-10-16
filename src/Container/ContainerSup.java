package Container;

import Model.Task;

import static Utilis.Constants.INITIAL_STACK_SIZE;

public abstract class ContainerSup implements Container{
    protected int size;
    protected Task[] tasks;


    public ContainerSup() {
        this.size = 0;
        this.tasks = new Task[INITIAL_STACK_SIZE];
    }

    public void add(Task task) {
        if(size == tasks.length){
            Task[] t = new Task[size*2];
            System.arraycopy(tasks,0,t,0,size*2);
            tasks=t;

        }
        tasks[size] = task;
        size++;
    }

    public int size() {
        return size;

    }


    public boolean isEmpty() {
        return size == 0;
    }
}
