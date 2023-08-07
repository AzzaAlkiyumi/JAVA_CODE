
import java.util.ArrayList;

import java.util.Scanner;
public class manageSalary {


    private static ArrayList<Employee> employees = new ArrayList<>();
     public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);

         int choice;


         while (true) {
             System.out.println("Choose an option:");

             System.out.println("1. Add a new employee and salary * 2. Show all Information * 0. To Exit");

             choice = scanner.nextInt();

             switch (choice) {

                 case 1:

                     addEmployee(scanner);

                     break;

                 case 2:

                     showSalaries();

                     break;

                 case 0:

                     System.out.println("Exit");
                     System.exit(choice);
                     break;

                 default:

                     System.out.println("Invalid choice. Please try again.");
             }
         }

     }




    private static void addEmployee(Scanner scanner) {

        System.out.println("Enter the name of the employee:");

        String name = scanner.next();

        System.out.println("Enter the salary of the employee:");

        int salary = scanner.nextInt();



        Employee employee = new Employee(name, salary);

        employees.add(employee);

        System.out.println(" successfully Adding ");

    }



    private static void showSalaries() {

        if (employees.isEmpty()) {

            System.out.println("No employees found.");

        } else {

            for (Employee employee : employees) {

                System.out.println("Name: " + employee.Name() + ", Salary: " + employee.Salary());

            }

        }

    }

}



class Employee {

    private String name;

    private int salary;



    public Employee(String name, int salary) {

        this.name = name;

        this.salary = salary;

    }



    public String Name() {

        return name;

    }

    public int Salary() {

        return salary;

    }

}