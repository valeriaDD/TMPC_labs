package classes.commands;

import abstractclasses.User;
import interfaces.ChatMediator;
import interfaces.Command;
import interfaces.MessageFormatter;

public class SendMessageCommand implements Command {
    private ChatMediator mediator;
    private String message;
    private User user;
    private MessageFormatter formatter;

    public SendMessageCommand(ChatMediator mediator, String message, User user) {
        this.mediator = mediator;
        this.message = message;
        this.user = user;
    }

    public void setFormatter(MessageFormatter formatter) {
        this.formatter = formatter;
    }

    public void execute() {
        String formattedMessage = formatter.format(message);
        mediator.sendMessage(formattedMessage, user);
    }
}
