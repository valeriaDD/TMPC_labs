package Classes.Levels;

import AbstractClasses.Enemy;
import AbstractClasses.GamePlay;
import AbstractClasses.Map;
import Classes.Factories.SpaceLevelFactory;
import Classes.Singleton.ScoreLogger;
import Interfaces.ILevel;

public class SpaceLevel implements ILevel {
    SpaceLevelFactory factory = new SpaceLevelFactory();
    ScoreLogger logger = ScoreLogger.getInstance();

    public void play() {
        Map map = factory.createMap();
        System.out.println("Going through the " + map.getName() + " that is a seen as " + map.getDescription());
        map.draw();

        Enemy enemy = factory.createEnemy();
        System.out.println("You have to face a " + enemy.getDescription());
        enemy.draw();

        GamePlay gamePlay = factory.createGamePlay();
        gamePlay.battle();

        System.out.println("see you in nex round");
        System.out.println("score:");
        System.out.println(logger.getResults());
    }
}
