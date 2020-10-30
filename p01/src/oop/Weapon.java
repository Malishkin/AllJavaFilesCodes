package oop;

public abstract class Weapon {
    private String name;
    public abstract void foo();
    //doesn't have a body{}
    public void show(){
        System.out.println(" ");
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
