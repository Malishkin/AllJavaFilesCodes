package exceptions;

import org.omg.CORBA.UserException;

public class UserEx {
    private String login;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) throws UsersException {
        if (login.length()<3) throw new UsersException(UsersException.SHORT_LOGIN);
        if (login.length()>6) throw new UsersException(UsersException.LONG_LOGIN);
        this.login = login;
    }
}
