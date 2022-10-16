package Run;

import Container.Strategy;
import Model.MessageTask;
import Model.SortingTask;
import Model.StrategySort;
import Runner.DelayTaskRunner;
import Runner.PrinterTaskRunner;
import Runner.StrategyTaskRunner;

import java.time.LocalDateTime;

public class CmdLineApp {




    public static void run(Strategy strategy){
        MessageTask taskLaborator = new MessageTask(
                "1","Seminar", "tema laborator",
                "Florentin", "Razvan", LocalDateTime.now());
        MessageTask taskTema = new MessageTask(
                "2","Laborator", "Solutie",
                "Razvan", "Florentin", LocalDateTime.now());
        MessageTask taskNota = new MessageTask(
                "3","Nota Lab", "10",
                "Florentin", "Razvan", LocalDateTime.now());
        MessageTask ms4 = new MessageTask(
                "4","Feedback", "Ai obtinut nota 9.60",
                "Gigi", "Ana", LocalDateTime.of(2018,9,27,9,29));
        MessageTask ms5 = new MessageTask(
                "5","Nota Lab", "10",
                "Florentin", "Razvan", LocalDateTime.now());
        MessageTask[] messages = new MessageTask[]{taskLaborator,taskTema,taskNota,ms4,ms5};

        StrategyTaskRunner STR = new StrategyTaskRunner(strategy);
        DelayTaskRunner DTR = new DelayTaskRunner(STR);
        PrinterTaskRunner PTR = new PrinterTaskRunner(STR);
        for(MessageTask msg : messages){
            STR.addTask(msg);
        }
        /*for(MessageTask msg : messages){
            DTR.addTask(msg);
        }
        for(MessageTask msg : messages){
            PTR.addTask(msg);
        }*/

        System.out.println("Str");
        STR.executeAll();
        System.out.println("Dtr");
        for(MessageTask msg : messages){
            DTR.addTask(msg);
        }

        DTR.executeAll();
        System.out.println("Ptr");

        for(MessageTask msg : messages){
            PTR.addTask(msg);
        }

        PTR.executeAll();

        int[] sir1 = new int[]{6,10,2,4,23,56,12,10,29};

        System.out.println("Merge");
        SortingTask ST_merge = new SortingTask("1","MergeSorter",sir1, StrategySort.Merge);
        ST_merge.execute();

        System.out.println("\nBubble");
        int[] sir2 = new int[]{6,10,2,4,23,56,12,10,29};
        SortingTask ST_bubble = new SortingTask("1","MergeSorter",sir2, StrategySort.Bubble);
        ST_bubble.execute();
    }
}
