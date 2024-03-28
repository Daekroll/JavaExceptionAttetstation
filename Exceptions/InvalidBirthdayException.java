package Exceptions;

public class InvalidBirthdayException extends IllegalArgumentException{
    public InvalidBirthdayException() {
        super("Неверная дата рождения!");
    }
}
