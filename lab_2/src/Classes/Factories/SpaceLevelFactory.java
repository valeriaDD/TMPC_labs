package Classes.Factories;

import AbstractClasses.Enemy;
import AbstractClasses.GamePlay;
import AbstractClasses.Map;
import Interfaces.ILevelFactory;

public class SpaceLevelFactory implements ILevelFactory {
    @Override
    public Enemy createEnemy() {
        return new EnemyFactory().getEnemy("ALIEN");
    }

    @Override
    public Map createMap() {
        return new MapFactory().getMap("SPACE");
    }

    @Override
    public GamePlay createGamePlay() {
        return new GamePlayFactory().getGamePlay("SPACE");
    }
}
