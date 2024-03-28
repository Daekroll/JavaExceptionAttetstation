package Exceptions;

public class InvalidDataException extends IndexOutOfBoundsException {
    public InvalidDataException() {
        super(String.format("Некоректные данные! Должно быть 6 полей."));
    }
}
