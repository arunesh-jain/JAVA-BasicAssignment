package Question21;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Employee obj[] = new Employee[5];

        Scanner scan = new Scanner(System.in);

        for(int i=0 ; i<obj.length ; i++)
        {
            System.out.print("\nEnter Employee ID : ");
            String id = scan.nextLine();
            System.out.print("Enter Employee Name : ");
            String name = scan.nextLine();
            System.out.print("Enter Employee Designation : ");
            String designation = scan.nextLine();

            obj[i].Employee(id,name,designation);
        }

        System.out.println("\n\n Details of Employees:");
        for(int i=0 ; i<obj.length ; i++)
        {
            String values[] = obj[i].getter();
            System.out.println("Employee ID : " + values[0]);
            System.out.println("Employee Name : " + values[1]);
            System.out.println("Employee Designation : " + values[2]);

        }
    }
}
