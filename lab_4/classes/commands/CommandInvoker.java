package classes.commands;

import interfaces.Command;

import java.util.ArrayList;
import java.util.List;

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