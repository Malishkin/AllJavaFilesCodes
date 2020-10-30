package exceptions;

public class NoNumberException extends Exception {
    @Override
    public String toString(){
        return "Вы ввели не число!";
    }
}
