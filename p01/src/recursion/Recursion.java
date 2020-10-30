package recursion;

public class Recursion {
    public static void main(String[] args) {
        showNums(100);
        System.out.println(sumCalculate(1539));

    }

    public static int factorial(int x) {
        //5! = 1*2*3*4*5 факториал от 0 = 1, от 1 = 1
        if (x == 1) {
            return 1;
        }
        return factorial(x - 1) * x;
    }

    public static void showNums(int i) {
        // метод, который печатает

        int x = 1;

// блок try проверяет, достигли ли мы нуля
        try {
            int m = x / i;                // здесь выбрасывается исключение при i = 0
            System.out.println(i);
            i--;
            showNums(i);                // а вот и рекурсивный вызов
        } catch (ArithmeticException e) {
            // деление на нуль выбрасывает ArithmeticException
            return;                    // Останавливается при попытке деления на нуль
        }


    }
    public static int sumCalculate(int n) {
        int sum = 0;
        while(n>0) {
            sum = sum + (n%10);
            n = n/10;
        }
        return  sum;
    }

}