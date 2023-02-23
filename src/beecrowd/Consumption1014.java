package beecrowd;

import java.util.Scanner;

public class Consumption1014 {



    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int y = reader.nextInt();
        double x = reader.nextDouble();

        double total = y/x;

        System.out.println(String.format("%.3f",total) + " km/l");

        reader.close();


    }
}
