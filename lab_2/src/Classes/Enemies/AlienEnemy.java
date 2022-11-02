package Classes.Enemies;

import AbstractClasses.Enemy;

public class AlienEnemy extends Enemy {

    public AlienEnemy() {
        this.name = "Alien";
        this.healthPoint = 100;
        this.power = 10;
    }

    public void draw() {
        System.out.println(
                "                _____\n" +
                        "             ,-\"     \"-.\n" +
                        "            / o       o \\\n" +
                        "           /   \\     /   \\\n" +
                        "          /     )-\"-(     \\\n" +
                        "         /     ( 6 6 )     \\\n" +
                        "        /       \\ \" /       \\\n" +
                        "       /         )=(         \\\n" +
                        "      /   o   .--\"-\"--.   o   \\\n" +
                        "     /    I  /  -   -  \\  I    \\\n" +
                        " .--(    (_}y/\\       /\\y{_)    )--.\n" +
                        "(    \".___l\\/__\\_____/__\\/l___,\"    )\n" +
                        " \\                                 /\n" +
                        "  \"-._      o O o O o O o      _,-\"\n" +
                        "      `--Y--.___________.--Y--'\n" +
                        "         |==.___________.==|    \n" +
                        "         `==.___________.==' `  "
        );
    }
}
