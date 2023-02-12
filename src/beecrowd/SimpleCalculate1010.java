package beecrowd;

import java.math.BigDecimal;
import java.util.Scanner;

public class SimpleCalculate1010 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int codeProduct1 = reader.nextInt();
        int unitsProduct1 = reader.nextInt();
        BigDecimal priceOneUnitProduct1 = reader.nextBigDecimal();

        int codeProduct2 = reader.nextInt();
        int unitsProduct2 = reader.nextInt();
        BigDecimal priceOneUnitProduct2 = reader.nextBigDecimal();



        BigDecimal total1 = priceOneUnitProduct1.multiply(BigDecimal.valueOf(unitsProduct1)).add(priceOneUnitProduct2.multiply(BigDecimal.valueOf(unitsProduct2)));


        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", total1));




    }
}
