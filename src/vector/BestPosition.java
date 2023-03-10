package vector;

import java.util.Locale;
import java.util.Scanner;

public class BestPosition {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("HOW MANY NUMBERS DO YOU WANT?");
        int n = sc.nextInt();

        int[] numbers = new int[n];
        int bestValue = 0;
        int minorValue = 0;

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextInt();
            if(bestValue < numbers[i]){
                bestValue = numbers[i];
            }

            if(numbers[i] < minorValue || minorValue == 0 ){
                minorValue = numbers[i];
            }

        }

        System.out.println("BEST VALUE: " + bestValue);
        System.out.println("MINOR VALUE: " + minorValue);

    }
}
