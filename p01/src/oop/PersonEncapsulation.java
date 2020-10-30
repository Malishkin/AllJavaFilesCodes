package oop;

public class PersonEncapsulation {
    private String mr = "Mr. ";
    private String name = "Max";
    public String getName(){
        return mr + name;
    }
    public void setName(String mr,String name){
        this.mr = mr;
        this.name = name;


    }
}
