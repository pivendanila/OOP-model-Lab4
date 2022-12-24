package exceptions;

public class EmptyStringException extends Error{
    public EmptyStringException(String message){
        super(message);
    }
}