package interfaces;

public interface Command {
    void setFormatter(MessageFormatter formatter);

    void execute();
}

