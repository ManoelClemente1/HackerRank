package vector;

import java.util.Locale;
import java.util.Scanner;

public class AveragePrice {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product[] vect = new Product[n];

        for(int i = 0; i < n; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            Product product = new Product(name, price);
            vect[i] = product;
        }

        double sum = 0.0;
        for(int i = 0; i < n; i++){
            sum += vect[i].getprice();
        }

        double average = sum / n;

        System.out.println("AVERAGE BETWEEN " + n + " PRODUCTS ARE = " + average);

        sc.close();

    }
}
