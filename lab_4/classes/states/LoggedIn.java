package classes.states;

import abstractclasses.User;
import interfaces.State;

public class LoggedIn implements State {
    private User user;

    public LoggedIn(User user) {
        this.user = user;
    }

    public void send(String message) {
        System.out.println(user.getName() + ": Sending Message: " + message);
        user.getMediator().sendMessage(message, user);
    }

    public void receive(String message) {
        System.out.println(user.getName() + ": Received Message: " + message);
    }
}