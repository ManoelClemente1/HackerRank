package POO;

import java.util.Locale;
import java.util.Scanner;

public class SumVector {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("HOW MANY NUMBERS DO YOU WANT?");
        int n = sc.nextInt();

        int[] realNumbers = new int[n];

        int sum = 0;
        int media = 0;

        System.out.println("TYPE : " + n +" NUMBERS");
        for(int i = 0; i < realNumbers.length; i++){
            realNumbers[i] = sc.nextInt();
        }

        System.out.println("VALUES : ");
        for(int i = 0; i < realNumbers.length; i++){
            System.out.println(realNumbers[i]);
            sum += realNumbers[i];
        }

        media = sum / n;

        System.out.println("SUM " + sum);
        System.out.println("MEDIA " + media);

        sc.close();
    }
}
