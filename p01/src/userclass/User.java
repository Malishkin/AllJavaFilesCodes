package userclass;

public abstract class User implements PrintData {
    abstract public void printUser();

    int id;
     String login;
     String password;
    public User(int id,String login,String password){
        this.id = id;
        this.login = login;
        this.password = password;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getLogin() {
        return login;
    }
    public  void setLogin(String login){
        this.login = login;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getTextInfo(){
        return "id = "+this.id+", login = "+this.login+", password = "+this.password;
    }
}
