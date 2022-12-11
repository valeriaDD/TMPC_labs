package classes.chat;

import abstractclasses.User;
import interfaces.ChatMediator;

import java.lang.Iterable;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class ChatRoom implements ChatMediator, Iterable<User> {
    private List<User> users;

    public ChatRoom() {
        users = new ArrayList<>();
    }

    public void registerUser(User user) {
        users.add(user);
    }

    public void sendMessage(String message, User user) {
        for (User u : users) {
            // Don't send the message to the user who sent it
            if (u != user) {
                u.receive(message);
            }
        }
    }

    public Iterator<User> iterator() {
        return users.iterator();
    }
}
