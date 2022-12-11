package classes.states;

import abstractclasses.User;
import interfaces.State;

public class LoggedOut implements State {
    private User user;

    public LoggedOut(User user) {
        this.user = user;
    }

    public void send(String message) {
        System.out.println(user.getName() + " is not logged in and cannot send messages");
    }

    public void receive(String message) {
        System.out.println(user.getName() + " is not logged in and cannot receive messages");
    }
}

