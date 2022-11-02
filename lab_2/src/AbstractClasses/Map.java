package AbstractClasses;

public abstract class Map {
    protected String name;
    protected String description;

    public String getDescription() {
        return this.description;
    }

    public String getName() {
        return this.name;
    }

    public abstract void draw();
}
