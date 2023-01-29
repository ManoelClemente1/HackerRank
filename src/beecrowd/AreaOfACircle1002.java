package beecrowd;

import java.util.Scanner;

public class AreaOfACircle1002 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Integer raio = leitor.nextInt();

        leitor.close();

        double area = 3.14159 * (raio * raio);
        System.out.println(String.format("A=%.4f", area));
    }

}
