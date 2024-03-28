package Exceptions;

public class InvalidGenderArgumentException extends IllegalArgumentException {
    public InvalidGenderArgumentException() {
        super("Указан некоррекный пол!");
    }
}
