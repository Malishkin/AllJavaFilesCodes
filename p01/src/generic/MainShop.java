package generic;

import java.sql.Array;
import java.util.ArrayList;

public class MainShop {
    public static void main(String[] args) {
      Integer[]arr1 = {1,2,3,4};
      String []arr2 = {"cheese","coffee","bread","butter"};
      Shop<Integer> s1 = new Shop<Integer>(arr1);
      Shop<String> s2 = new Shop<String>(arr2);
      s1.printObject();
      s2.printObject();

    }
}
