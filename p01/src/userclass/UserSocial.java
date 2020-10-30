package userclass;

public class UserSocial extends User implements Cloneable{

    private String name;
    private int age;

    public UserSocial(int id, String login, String password, String name, int age) {
        super(id, login, password);
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void printUser() {
        System.out.println("My name is "+this.name);

    }

    public String getTextInfo(){
         String s = super.getTextInfo();
         s+=", name = "+this.name+", age = "+this.age;
         return s;
    }

    public String toString(){
        return "Объект с id "+id+", логином "+login+", и паролем "+password;
    }
    public UserSocial clone(){
        return new UserSocial(id,login,password,name,age);
    }
}
