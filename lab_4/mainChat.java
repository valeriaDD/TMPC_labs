import abstractclasses.User;
import classes.chat.ChatRoom;
import classes.chat.ChatUser;
import classes.commands.CommandInvoker;
import classes.commands.SendMessageCommand;
import classes.formatter.PlainTextFormatter;
import classes.states.LoggedIn;
import classes.states.LoggedOut;
import interfaces.Command;
import interfaces.MessageFormatter;

public class mainChat {
    public static void main(String[] args) {
        // Create a chat mediator
        ChatRoom mediator = new ChatRoom();

        User alice = new ChatUser(mediator, "Alice");
        User bob = new ChatUser(mediator, "Bob");
        User charlie = new ChatUser(mediator, "Charlie");
        User john = new ChatUser(mediator, "John");

        mediator.registerUser(alice);
        mediator.registerUser(bob);
        mediator.registerUser(charlie);
        mediator.registerUser(john);

        alice.logIn();
        bob.logIn();
        john.logIn();


        for (User user : mediator) {
            System.out.println(user.getName() + "is currently " + user.getState());
        }

        System.out.println();

        // Create a command for sending a message and execute it
        Command command = new SendMessageCommand(mediator, "Hello, how are you all!", alice);

        // Use a different message formatter for the command
        MessageFormatter formatter = new PlainTextFormatter();
        command.setFormatter(formatter);

        CommandInvoker invoker = new CommandInvoker();
        invoker.storeAndExecute(command);
    }
}
