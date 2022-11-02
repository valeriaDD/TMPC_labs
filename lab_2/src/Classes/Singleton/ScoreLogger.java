package Classes.Singleton;

import java.util.HashMap;
import java.util.Map;

public class ScoreLogger {
    private static ScoreLogger scoreLogger;
    private int userPoints = 0;
    private int enemiesPoints = 0;

    private ScoreLogger() {}

    public static ScoreLogger getInstance() {
        if(scoreLogger == null) {
            scoreLogger = new ScoreLogger();
        }

        return scoreLogger;
    }

    public void logResult(int userPoints, int enemiesPoints) {
        this.userPoints += userPoints;
        this.enemiesPoints += enemiesPoints;
    }

    public  Map<String, Integer> getResults() {
        Map<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("userPoints", this.userPoints);
        hm.put("enemiesPoints", this.enemiesPoints);

        return hm;
    }

    public void resetScore() {
        this.userPoints = 0;
        this.enemiesPoints = 0;
    }

}

