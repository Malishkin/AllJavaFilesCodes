package staticdata;

public class MyMath {
    private static int count = 0;

    public static double add(double x, double y) {
        count++;
        return x+y;
    }


    public static double sub(double x, double y){
        count++;
        return x-y;
    }
    public static double mult(double x, double y){
        count++;
        return x*y;
    }
    public static double div(double x, double y) {
        count++;
        return x/y;
    }


    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        MyMath.count = count;
    }
}
