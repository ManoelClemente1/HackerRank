package beecrowd;

import java.util.Scanner;

public class SimpleSum {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int A = leitor.nextInt();
        int B = leitor.nextInt();
        int SOMA = A + B;

        leitor.close();

        System.out.println("SOMA = " +SOMA);
    }
}


