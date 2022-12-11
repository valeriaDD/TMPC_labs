package classes.chat;

import abstractclasses.User;
import interfaces.ChatMediator;
import interfaces.State;

public class ChatUser extends User {
    public ChatUser(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    public void send(String message) {
        state.send(message);
    }

    public void receive(String message) {
        state.receive(message);
    }
}
