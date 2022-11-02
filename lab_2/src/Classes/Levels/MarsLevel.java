package Classes.Levels;

import AbstractClasses.Enemy;
import AbstractClasses.GamePlay;
import AbstractClasses.Map;
import Classes.Factories.MarsLevelFactory;
import Classes.Factories.SpaceLevelFactory;
import Classes.Singleton.ScoreLogger;
import Interfaces.ILevel;

public class MarsLevel implements ILevel {
    MarsLevelFactory factory = new MarsLevelFactory();
    ScoreLogger logger = ScoreLogger.getInstance();

    public void play() {
        Map map = factory.createMap();
        System.out.println("Well you got here, DONT KNOW HOW! " + map.getName() + " is a " + map.getDescription());
        map.draw();

        Enemy enemy = factory.createEnemy();
        System.out.println("Here you see a " + enemy.getDescription());
        enemy.draw();

        GamePlay gamePlay = factory.createGamePlay();
        gamePlay.battle();

        System.out.println("That's it, see how lucky you are");
        System.out.println("score:");
        System.out.println(logger.getResults());
    }
}
