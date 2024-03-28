package Exceptions;

public class InvalidNumberException extends NumberFormatException {
    public InvalidNumberException() {
        super("Неверный номер!");
    }
}
