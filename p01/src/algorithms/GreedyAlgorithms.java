package algorithms;

import java.util.Arrays;

public class GreedyAlgorithms {
    public static void main(String[] args) {
        int[] digits = {3, 1, 7, 9, 9, 5};
        System.out.println(maxNumberFromDigits(digits));
        int[] stations = {0, 200, 350, 550, 750, 950};
        System.out.println(minStops(stations, 400));

    }

    public static String maxNumberFromDigits(int[] digits) {
        Arrays.sort(digits);
        String result = "";
        for (int i = digits.length - 1; i >= 0; i--) {
            result += digits[i];
        }
        return result;
    }

    public static int minStops(int[] stations, int capasity) {
        int result = 0; //оптиальное количество остановок
        int currentStop = 0;
        while (currentStop < stations.length - 1) {
            int nextStop = currentStop;
            while (nextStop < stations.length-1  &&
                    stations[nextStop + 1] - stations[currentStop] <= capasity)
                nextStop++;
            if (currentStop == nextStop)
                return -1;

            if (nextStop < stations.length - 1)
                result++;
            currentStop = nextStop;
        }
        return result;
    }
}