package beecrowd;

import java.util.Scanner;

public class TheGreatest1013 {



    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int a = reader.nextInt();
        int b = reader.nextInt();
        int c = reader.nextInt();

        int ab = (a + b + Math.abs(a - b))/2;
        int abc = (ab + c + Math.abs(ab - c))/2;

        System.out.println(abc + " eh o maior");

        reader.close();


    }
}
