package Classes.Builder;

public class StoryBuilder {

    private Story story = new Story();

    public void playerName(String name) {
        story.setPlayerName(name);
    }

    public void description(String description) {
        story.setDescription(description);
    }

    public void reset() {
        this.story = new Story();
    }

    public Story build() {
        return story;
    }
}
