package oop;

public class Student {
    Student(){

    }
    private String name;
    private int age;
    private String gender;

    public String getName(){
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getGender(){
        return gender;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public void writeAll(){
        System.out.println("My name is "+name+", I'm "+age+" years old and I'm a "+gender+".");
    }

    Student(String name,int age){
        this.name = name;
        this.age = age;

    }
     public boolean isYoung(int age){
//        if (age<18){
//            return true;
//        }
//        else {
//            return false;
//
         return age < 18;
    }
    Student(int[] array){
        for (int i = 0; i<array.length; i++){
            System.out.println(isYoung(array[i]));
        }
        }

    }




