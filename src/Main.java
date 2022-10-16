import Container.Strategy;
import Run.CmdLineApp;
import Run.TestRunner;

public class Main {
    public static void main(String[] args) {
        //System.out.println(args[0]);
        Strategy strat = Strategy.valueOf(args[0]);

        CmdLineApp.run(strat);

        //TestRunner.run();
    }
}
