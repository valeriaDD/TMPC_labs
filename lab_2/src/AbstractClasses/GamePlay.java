package AbstractClasses;

public abstract class GamePlay {

    public int getRandomBinaryNumber() {
        return (int) Math.round( Math.random() );
    }

    public abstract void battle();
}
