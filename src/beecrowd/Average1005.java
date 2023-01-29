package beecrowd;

import java.util.Scanner;

public class Average1005 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double a = leitor.nextDouble();
        double b = leitor.nextDouble();

        leitor.close();

        double MEDIA = ((a * 3.5) + (b * 7.5)) / 11;

        System.out.println(String.format("MEDIA = %.5f", MEDIA));
    }

}

