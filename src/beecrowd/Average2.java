package beecrowd;

import java.util.Scanner;

public class Average2 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double a = leitor.nextDouble();
        double b = leitor.nextDouble();
        double c = leitor.nextDouble();

        leitor.close();

        double MEDIA = (a/10 * 2) + (b/10 * 3) + (c/10 * 5);

        System.out.println(String.format("MEDIA = %.1f", MEDIA));
    }

}

