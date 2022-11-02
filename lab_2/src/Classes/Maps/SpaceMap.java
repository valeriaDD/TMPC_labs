package Classes.Maps;


import AbstractClasses.Map;

public class SpaceMap extends Map {
    public SpaceMap() {
        this.name = "Space";
        this.description = "description of a space";
    }

    @Override
    public void draw() {
        System.out.println(
               "                           *     .--.\n" +
                       "                                / /  `\n" +
                       "               +               | |\n" +
                       "                      '         \\ \\__,\n" +
                       "                  *          +   '--'  *\n" +
                       "                      +   /\\\n" +
                       "         +              .'  '.   *\n" +
                       "                *      /======\\      +\n" +
                       "                      ;:.  _   ;\n" +
                       "                      |:. (_)  |\n" +
                       "                      |:.  _   |\n" +
                       "            +         |:. (_)  |          *\n" +
                       "                      ;:.      ;\n" +
                       "                    .' \\:.    / `.\n" +
                       "                   / .-'':._.'`-. \\\n" +
                       "                   |/    /||\\    \\|\n" +
                       "                 _..--\"\"\"````\"\"\"--.._\n" +
                       "           _.-'``                    ``'-._\n" +
                       "         -'                                '-"
        );
    }
}
