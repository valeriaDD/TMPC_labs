package Classes.Builder;

import Interfaces.IStory;

public class Story implements IStory {
    private String description;
    private String playerName;

    public Story() {
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void display() {
        System.out.print("Hi");

        if (this.playerName != null){
            System.out.println(", " + this.playerName);
        }

        if (this.description != null) {
            System.out.println();
            System.out.println(this.description);
        }

        System.out.println();
        System.out.println("Let's play a small game");
        System.out.println("Fight some enemies and see if you are lucky enough");
    }
}
