package Classes.Factories;

import AbstractClasses.Enemy;
import AbstractClasses.GamePlay;
import AbstractClasses.Map;
import Interfaces.ILevelFactory;

public class MarsLevelFactory implements ILevelFactory {
    @Override
    public Enemy createEnemy() {
        return new EnemyFactory().getEnemy("MARS_MONSTER");
    }

    @Override
    public Map createMap() {
        return new MapFactory().getMap("MARS");
    }

    @Override
    public GamePlay createGamePlay() {
        return new GamePlayFactory().getGamePlay("MARS");
    }
}
