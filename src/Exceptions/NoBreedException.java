package Exceptions;

public class NoBreedException extends Exception {
    String message;

    public NoBreedException() {
        this.message = "No message in this exception.";
    }

    public NoBreedException(String message) {
        this.message = message;
    }
}
