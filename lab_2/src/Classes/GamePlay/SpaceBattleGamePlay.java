package Classes.GamePlay;

import AbstractClasses.GamePlay;
import Classes.Singleton.ScoreLogger;

public class SpaceBattleGamePlay extends GamePlay {
    ScoreLogger scoreLogger = ScoreLogger.getInstance();

    @Override
    public void battle() {
        int plot = this.getRandomBinaryNumber();
        System.out.println(plot);

        System.out.println("Space battle started!");

        if (plot == 1) {
            scoreLogger.logResult(0, 1);
            System.out.println("The enemy destroyed your ship and you fall into the darkness");
        }
        else {
            scoreLogger.logResult(1, 0);
            System.out.println("You have destroyed the enemy but your space ship is not working properly...");
        }
    }
}
