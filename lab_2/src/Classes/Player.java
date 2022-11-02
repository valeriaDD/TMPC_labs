package Classes;

import Interfaces.IPlayer;

import java.util.Scanner;

public class Player implements IPlayer, Cloneable {
    Scanner scanner = new Scanner(System.in);
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void changeName(String name) throws NumberFormatException {
        Player clone = this.clone();
        this.setName(name);

        System.out.println("Do you want to change your name from " + clone.getName() + " to " + this.getName() + "? 1/0");
        int input = scanner.nextInt();

        if (input > 1){
            throw new NumberFormatException();
        }

        if (input == 0) {
            this.setName(clone.getName());
        }

        System.out.println("Player name: " + this.getName());
    }

    @Override
    public Player clone() {
        try {
            return (Player) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
