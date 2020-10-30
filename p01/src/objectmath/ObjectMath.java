package objectmath;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ObjectMath {
    public static void main(String[] args) {
        System.out.println(Math.E);
        System.out.println(Math.PI);
        System.out.println(Math.abs(-5));
        System.out.println(Math.sin(1));
        System.out.println(Math.cos(1));
        System.out.println(Math.tan(1));
        System.out.println(Math.sin(30*Math.PI/180));//sin of 30 degrees
        System.out.println(Math.max(10,20));
        System.out.println(Math.min(10,20));
        System.out.println(Math.pow(5,2));//5 во второй степени
        System.out.println(Math.round(5.4));
        System.out.println(Math.ceil(5.56));//округляет до ближайшего верхнего целого числа
        System.out.println(Math.floor(5.56));//округляет до ближайшего нижнего целого числа
        BigDecimal bigDecimal = new BigDecimal(5.9345678);
        System.out.println(bigDecimal.setScale(3, RoundingMode.HALF_UP));
        System.out.println(Math.random());
        int i = (int)(Math.random() * 11);
        int j = (int)(1 + Math.random() * 10);
        System.out.println(i);
        System.out.println(j);

    }

}
