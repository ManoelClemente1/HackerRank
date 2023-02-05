package beecrowd;

import java.math.BigDecimal;
import java.util.Scanner;

public class Salary1008 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int employeeNumber = leitor.nextInt();
        int hoursWorked = leitor.nextInt();
        BigDecimal employeeSalary = leitor.nextBigDecimal();


        BigDecimal salaryTotal = employeeSalary.multiply(BigDecimal.valueOf(hoursWorked));

        System.out.println("NUMBER = " + employeeNumber);
        System.out.println("SALARY = U$" + salaryTotal);


    }
}
