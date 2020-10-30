package exceptions;

public class UsersException extends Exception {
    final static int SHORT_LOGIN = 1;
    final static int LONG_LOGIN = 2;
    private int code;
    public UsersException(int code){
        this.code = code;
    }
    public int getCode(){
        return code;
    }

}
