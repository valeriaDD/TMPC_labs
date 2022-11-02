package Classes.GamePlay;

import AbstractClasses.GamePlay;
import Classes.Singleton.ScoreLogger;

public class MarsGamePlay extends GamePlay {
    ScoreLogger scoreLogger = ScoreLogger.getInstance();

    @Override
    public void battle() {
        int plot = this.getRandomBinaryNumber();

        System.out.println("The Mars battle started!");

        if (plot == 1) {
            scoreLogger.logResult(0, 1);
            System.out.println("The enemy won this battle");
        }
        else {
            scoreLogger.logResult(1, 0);
            System.out.println("You won this battle!");
        }
    }
}
