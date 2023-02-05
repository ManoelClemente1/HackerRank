package beecrowd;

import java.math.BigDecimal;
import java.util.Scanner;

public class Salary1009 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        String employeeName = reader.nextLine();
        BigDecimal fixedSalary = reader.nextBigDecimal();
        BigDecimal monthSales = reader.nextBigDecimal();

        BigDecimal bonusByMonthSales = monthSales.multiply(new BigDecimal("0.15"));

        BigDecimal salaryTotal = fixedSalary.add(bonusByMonthSales);

        System.out.println(String.format("TOTAL = R$ %.2f", salaryTotal));


    }
}
