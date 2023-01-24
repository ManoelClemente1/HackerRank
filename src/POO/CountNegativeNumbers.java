package POO;

import java.util.Locale;
import java.util.Scanner;

public class CountNegativeNumbers {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if(n < 0){
            throw new IllegalArgumentException("The first number cannot be negative");
        }


        int[] arr = new int[n];

        for (int i = 0; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0)
            System.out.println(arr[i]);
        }


        sc.close();
    }
}
