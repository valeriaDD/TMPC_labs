import Classes.Builder.Story;
import Classes.Builder.StoryBuilder;
import Classes.Levels.MarsLevel;
import Classes.Levels.SpaceLevel;
import Classes.Player;
import Interfaces.ILevel;
import Interfaces.IPlayer;

public class main {
    public static void main(String[] args) {
        IPlayer player = new Player("miaw");

        StoryBuilder storyBuilder = new StoryBuilder();
        ILevel spaceLevel = new SpaceLevel();
        ILevel marsLevel = new MarsLevel();

        storyBuilder.playerName(player.getName());
        Story story = storyBuilder.build();
        story.display();

        spaceLevel.play();

        player.changeName("Miaw");

        marsLevel.play();
    }
}
