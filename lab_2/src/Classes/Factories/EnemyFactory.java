package Classes.Factories;

import AbstractClasses.Enemy;
import Classes.Enemies.AlienEnemy;
import Classes.Enemies.MarsMonster;

public class EnemyFactory {

    public Enemy getEnemy(String type){
        if(type == null){
            return null;
        }
        if(type.equalsIgnoreCase("ALIEN")){
            return new AlienEnemy();

        } else if(type.equalsIgnoreCase("MARS_MONSTER")) {
            return new MarsMonster();
        }

        return null;
    }
}
