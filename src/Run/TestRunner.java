package Run;

import Container.Strategy;
import Model.MessageTask;
import Runner.DelayTaskRunner;
import Runner.PrinterTaskRunner;
import Runner.StrategyTaskRunner;

import java.time.LocalDateTime;

public class TestRunner {

    public static MessageTask[] get_messages(){
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
        return new MessageTask[] {taskLaborator,taskTema,taskNota,ms4,ms5};

    }
    public static void run(){
        /*MessageTask[] messages = get_messages();
        for(MessageTask msg:messages){
            msg.execute();*/

        /*StrategyTaskRunner STR = new StrategyTaskRunner(Strategy.LIFO);

        MessageTask[] messages = get_messages();
        for(MessageTask msg : messages){
            STR.addTask(msg);
        }
        STR.executeAll();*/

        StrategyTaskRunner STR = new StrategyTaskRunner(Strategy.FIFO);
        PrinterTaskRunner PTR = new PrinterTaskRunner(STR);

        MessageTask[] messages = get_messages();
        /*for(MessageTask msg : messages){
            PTR.addTask(msg);
        }*/
        //PTR.executeAll();

        DelayTaskRunner DTR = new DelayTaskRunner(STR);

        for(MessageTask msg : messages){
            DTR.addTask(msg);
        }
        DTR.executeAll();
    }


}
