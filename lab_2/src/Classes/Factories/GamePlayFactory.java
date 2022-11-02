package Classes.Factories;

import AbstractClasses.GamePlay;
import Classes.Enemies.AlienEnemy;
import Classes.Enemies.MarsMonster;
import Classes.GamePlay.MarsGamePlay;
import Classes.GamePlay.SpaceBattleGamePlay;

public class GamePlayFactory {

    public GamePlay getGamePlay(String type){
        if(type == null){
            return null;
        }
        if(type.equalsIgnoreCase("SPACE")){
            return new SpaceBattleGamePlay();

        } else if(type.equalsIgnoreCase("MARS")) {
            return new MarsGamePlay();
        }

        return null;
    }
}
