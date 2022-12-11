package interfaces;

public interface State {
    void send(String message);
    void receive(String message);
}
