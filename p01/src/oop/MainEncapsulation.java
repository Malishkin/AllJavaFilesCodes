package oop;

public class MainEncapsulation {
    public static void main(String[] args) {
        PersonEncapsulation person = new PersonEncapsulation();
        System.out.println(person.getName());
        person.setName("Mrs. ", "Janna");
        System.out.println(person.getName());

    }
}
