package Model;

import Container.Strategy;

public class SortingTask extends Task {
    private int[] sir;

    private AbstractSorter sorter;

    public SortingTask(String taskID, String description, int[] sir,StrategySort strategySort ) {
        super(taskID, description);
        this.sir=sir;
        if(strategySort == StrategySort.Merge){
            sorter = new MergeSorter();

        } else if (strategySort == StrategySort.Bubble) {
            sorter = new BubbleSorter();
        }
        else{
            sorter = null;
        }
    }

    @Override
    public void execute() {
        sorter.sort(sir);
        for(int i:sir){
            System.out.print(i + " ");

        }
    }
}
