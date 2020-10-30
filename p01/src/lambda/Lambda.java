package lambda;
import java.util.Arrays;

public class Lambda {
    public static void main(String[] args) {
        Integer [] arrInt = {10,25,47,1,8,69,33,18,22,66};
        Arrays.sort(arrInt, (i1, i2) -> Integer.compare(i2, i1));
        for (int i : arrInt) System.out.println(i);
    }

}



