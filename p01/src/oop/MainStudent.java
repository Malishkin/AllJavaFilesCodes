package oop;

public class MainStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Bob");
        student1.setAge(17);
        student1.setGender("male");
        student1.writeAll();
        Student student2 = new Student("John", 45);
        System.out.println(student1.isYoung(17));
        System.out.println(student2.isYoung(45));
        Student student3 = new Student(new int[]{17, 16, 19, 20, 21});
//        Rect rect1 = new Rect();
//        rect1.setWidth(13);
//        System.out.println(rect1.getWidth());
//        Rect rect2 = new Rect(10,20);
//        System.out.println(rect2.getWidth()+" , " +rect2.getHeight());

    }
}
