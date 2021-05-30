package Exceptions;

public class NoBreedException extends RuntimeException {

    public NoBreedException() {
        super("No message in this exception.");
    }

    public NoBreedException(String message) {
        super(message);
    }
}
