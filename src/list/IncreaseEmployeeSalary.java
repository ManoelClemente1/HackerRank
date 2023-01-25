package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class IncreaseEmployeeSalary {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> listEmployees = new ArrayList<>();

        System.out.println("How many employees will be registered? ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){

            System.out.println();
            System.out.println("Employee #" + (i+1) + " : ");

            System.out.print("Id: ");
            Integer id = sc.nextInt();

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, salary);

            listEmployees.add(emp);
        }

        System.out.println("Enter the employee id that will have salary increase: ");
        int idToBeEncrease = sc.nextInt();

        boolean employeeExists = true;

        for(Employee employee : listEmployees){
            if(employee.getId().equals(idToBeEncrease)){
                employeeExists = true;
                break;
            } else{
                employeeExists = false;

            }
        }

        if(!employeeExists){
            throw new IllegalArgumentException("Employee id " + idToBeEncrease +" doesnt exists!");
        }

        System.out.println("Enter the percentage: ");
        int percentage = sc.nextInt();

        for(Employee employee : listEmployees) {
            if (employee.getId().equals(idToBeEncrease)) {
                employee.setSalary(employee.getSalary() + employee.getSalary() * percentage / 100);
            }
        }

        System.out.println("List actualized of employees: ");
        for (Employee employee : listEmployees){
            System.out.println(employee.getId() + " , " + employee.getName() + " , " + employee.getSalary());
        }


        sc.close();
    }
}
