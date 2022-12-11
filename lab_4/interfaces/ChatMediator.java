package interfaces;

import abstractclasses.User;

public interface ChatMediator {
    void registerUser(User user);

    void sendMessage(String message, User user);
}

