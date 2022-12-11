package abstractclasses;

import classes.states.LoggedIn;
import classes.states.LoggedOut;
import interfaces.ChatMediator;
import interfaces.State;

public abstract class User {
    protected ChatMediator mediator;
    protected String name;
    protected State state;

    public User(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
        this.state = new LoggedOut(this);
    }

    public String getName() {
        return this.name;
    }

    public abstract void send(String message);
    public abstract void receive(String message);

    public ChatMediator getMediator() {
        return this.mediator;
    };

    public void logIn() {
        this.state = new LoggedIn(this);
    };

    public void logOut() {
        this.state = new LoggedOut(this);
    };

    public String getState() {
        return this.state.getClass().getSimpleName();
    };
}