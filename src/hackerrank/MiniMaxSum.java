package hackerrank;

import java.util.Arrays;
import java.util.List;

public class MiniMaxSum {

    public static void main(String[] args) {

        List<Integer> arr = Arrays.asList(5  ,5 , 5 , 5 , 5);

        int[] newArray = arr.stream().mapToInt(i -> i).toArray();

        Arrays.sort(newArray);

        long sumWithoutMinValue = 0;
        long sumWithoutMaxValue = 0;
        int minValue = Arrays.stream(newArray).min().getAsInt();
        int maxValue = Arrays.stream(newArray).max().getAsInt();

        long countEquals = Arrays.stream(newArray).distinct().count();

        if(countEquals == 0) {
            for (int i : newArray) {
                if (i != minValue)
                    sumWithoutMinValue += i;

                if (i != maxValue)
                    sumWithoutMaxValue += i;
            }
        } else{
            for (int i : newArray){
                sumWithoutMinValue += i;
                sumWithoutMaxValue += i;

            }
                sumWithoutMinValue -= maxValue;
                sumWithoutMaxValue -= minValue;
        }

        System.out.println( sumWithoutMinValue + " " +  sumWithoutMaxValue);

    }

}
