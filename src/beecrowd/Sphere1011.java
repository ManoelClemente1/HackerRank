package beecrowd;

import java.util.Scanner;

public class Sphere1011 {



    public static void main(String[] args) {

        double pi = 3.14159;

        Scanner reader = new Scanner(System.in);

        double raio = reader.nextDouble();
        double volume = (4.0 / 3) * pi * Math.pow(raio, 3.0);
        System.out.println(String.format("VOLUME = %.3f", volume));


    }
}
