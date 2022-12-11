package classes.formatter;

import interfaces.MessageFormatter;

public class PlainTextFormatter implements MessageFormatter {
    public String format(String message) {
        return message;
    }
}
