package oop;

public class Electrocar {
    private int id;
    public Electrocar(int id){
        this.id=id;
    }
    //inner nonstatic class
    private class Motor {
        public void startMotor(){
            System.out.println("Motor " +id+" is starting...");
        }
    }
    //static inner class
    public static class Battery {
        public void charge() {
            System.out.println("Battery is charging...");
        }
    }
    public void start(){

        Motor motor = new Motor();
        motor.startMotor();
        System.out.println("Electrocar "+id+" is starting...");
        final int x = 1;
        class SomeClass {
            public void someMethod(){
                System.out.println(x);
                System.out.println(id);

            }
        }
        SomeClass someObject = new SomeClass();
        test(someObject);
    }

    private void test(Object object) {

    }
}
