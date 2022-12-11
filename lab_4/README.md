# Topic: Behavior Design Patterns.

## Course: Software design techniques

### Author: Dubina Valeria

## Theory
Behavioral design patterns are a category of design patterns that focus on communication between objects. 
These patterns are used to help objects cooperate and coordinate their behavior in order to achieve a common goal.

The **Mediator** pattern is a behavioral design pattern that defines a way for different objects to communicate with 
each other without knowing about each other's internal details. The Mediator acts as a central hub that receives
messages from the objects and routes them to the appropriate destination. This can help to improve the 
modularity and maintainability of a software system by decoupling the objects from each other and allowing 
them to interact in a more flexible way.

The **Strategy** pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable. 
This allows the algorithms to be selected at runtime based on the specific needs of the program. 
The Strategy pattern can help to improve the flexibility and extensibility of a software system by allowing 
new algorithms to be added without breaking existing code.

The **Iterator** pattern provides a way to access the elements of an aggregate object sequentially without 
exposing its underlying representation. The Iterator provides a common interface for traversing different 
types of collections, such as lists, sets, and maps. This can help to improve the modularity and maintainability 
of a software system by allowing different collections to be accessed in a consistent way.

The **Command** pattern encapsulates a request as an object, allowing it to be treated as a separate entity that 
can be passed around and executed at a later time. This can be useful for implementing undo/redo functionality, 
as well as for supporting queues, logging, and other operations that require the ability to manipulate requests 
dynamically.

The **State** pattern allows an object to alter its behavior when its internal state changes. This pattern is often 
used in the context of finite state machines, where the object transitions between a fixed set of states based 
on its current state and the events that occur. The State pattern can help to improve the modularity and 
maintainability of a software system by allowing the behavior of an object to be defined in a separate class for 
each state.

## Objectives:
The objective of this laboratory work is to **implement 5 of the behavior design
patterns** and to explain them properly.

## Implementation description
For the purpose of this laboratory work, to illustrate 5 design patters, a simulation of a chat system was implemented.
This project is about a chat room where users can register, send and receive messages, and log in and out.

### Mediator pattern

The Mediator pattern is implemented in the `ChatMediator` interface and the `ChatRoom` class. The `ChatMediator` interface
defines methods for managing the users and messages in a chat room, and the `ChatRoom` class is a concrete implementation
of this interface that maintains a list of registered users and sends messages to them. This allows the communication
between the different User objects to be _mediated_ by the `ChatRoom`, which helps to reduce the complexity and tight
coupling between the User objects.

The `ChatRoom` class maintains a list of registered User objects, and defines methods for registering users and sending messages to them.
```java
public class ChatRoom implements ChatMediator {
  private List<User> users;

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
}
```

###  Command pattern
The Command pattern is implemented in the `SendMessageCommand` and `CommandInvoker` classes. The `SendMessageCommand` class
represents a command for _sending a message in the chat room_, and the `CommandInvoker` class is responsible _for executing
the command_. This allows the command to be executed at a later time, and also allows the command to be easily extended
or modified without changing the code that invokes it.

The `SendMessageCommand` class defines a `execute` method that sends the message to all the users registered with the chat 
room, except the user who sent it. This method uses the sendMessage method defined in the ChatMediator interface, 
which is implemented by the `ChatRoom` class.

```java
public class SendMessageCommand implements Command {
  private ChatMediator mediator;
  private String message;
  private User user;

  public SendMessageCommand(ChatMediator mediator, String message, User user) {
    this.mediator = mediator;
    this.message = message;
    this.user = user;
  }

  public void execute() {
    mediator.sendMessage(message, user);
  }
}
```

The `CommandInvoker` class defines a `storeAndExecute` method that stores the `Command object` in a list, and then executes
it by calling the execute method. 

```java
public class CommandInvoker {
  private List<Command> commands;

  public CommandInvoker() {
    commands = new ArrayList<>();
  }

  public void storeAndExecute(Command command) {
    commands.add(command);
    command.execute();
  }
}
```

### Strategy pattern

The Strategy pattern is implemented in the `MessageFormatter` interface and the `PlainTextFormatter` class.
The `MessageFormatter` interface defines a method for formatting messages, and the `PlainTextFormatter` class is a 
concrete implementation of this interface that formats messages as plain text. This allows different strategies for
formatting messages to be easily implemented and used interchangeably.

The `MessageFormatter` interface defines a `format` method that _takes a message as input and returns the formatted 
message as output_. In the main function, a `PlainTextFormatter` object is created and passed to the `setFormatter`
method of the `SendMessageCommand` object. This sets the `MessageFormatter` object to be used for formatting the message
when the command is executed.

```java
MessageFormatter formatter = new PlainTextFormatter();
command.setFormatter(formatter);
```

### State pattern

The State pattern is implemented in the `State`, `LoggedIn`, and `LoggedOut` classes. The State interface defines 
the common interface for different states, and the `LoggedIn` and `LoggedOut` classes are concrete implementations 
of this interface that define the behavior for the corresponding states. This allows the behavior of a `User` object 
to be changed depending on its state.

The `State` interface defines the `send` and `receive` methods that are used to send and receive messages in the chat 
room. These methods are implemented by the `LoggedIn` and `LoggedOut` classes, which define the behavior for the 
corresponding states. For example, the `LoggedIn` class allows the user to send and receive messages, while the `LoggedOut`
class does not.

The `User` class maintains a reference to the `State` object that defines its current state, and defines methods for
logging in and out. When a user logs in, the `User` object sets its state to `LoggedIn`, and when it logs out, the `User` 
object sets its state to `LoggedOut`. This allows the behavior of the `User` object to be changed depending on its state.

```java
public abstract class User {
    protected ChatMediator mediator;
    protected String name;
    protected State state;

    public User(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
        this.state = new LoggedOut(this);
    }

    public void logIn() {
        this.state = new LoggedIn(this);
    };

    public void logOut() {
        this.state = new LoggedOut(this);
    };
}
```

### Iterator pattern
The Iterator pattern is implemented in the `ChatRoom` class, which implements the `Iterable` interface and provides an
`iterator` method that returns an `Iterator` object for the `User` objects _registered with the chat room_.
```java
public class ChatRoom implements ChatMediator, Iterable<User> {
    private List<User> users;

    public ChatRoom() {
        users = new ArrayList<>();
    }
                    ...
    public Iterator<User> iterator() {
        return users.iterator();
    }
}
```
This allows the `User` objects to be traversed using a for-each loop.
```java
        ChatRoom mediator = new ChatRoom();

        for (User user : mediator) {
            System.out.println(user.getName() + "is currently " + user.getState());
        }
```