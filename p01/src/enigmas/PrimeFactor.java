package enigmas;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
    public static void main(String[] args) {
        primeFactors(81);
    }

    private static void primeFactors(int number) {
        List<Integer> list=new ArrayList<>();
        for(int i = 2;i<=number;i++){
            while (number%i==0){
                list.add(i);
                number=number/i;
            }
        }

        for (Integer integer :list) {
            System.out.println(integer);
        }

        }


    }

