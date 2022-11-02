package AbstractClasses;

public abstract class Enemy {
    protected String name;
    protected Integer power;
    protected Integer healthPoint;

    public String getDescription() {
        return this.name + " that has " + this.power + "power and with" + this.healthPoint + "HP!";
    }

    public abstract void draw();
}
