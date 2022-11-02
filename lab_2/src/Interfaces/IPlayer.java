package Interfaces;

public interface IPlayer extends Cloneable {
    String getName();

    void setName(String name);

    void changeName(String name);
}
