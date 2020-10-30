package exceptions;

public class NullException extends Exception{
    @Override
    public String toString(){
        return "Вы ничего не ввели!";
    }
}
