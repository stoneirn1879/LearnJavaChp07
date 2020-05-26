import java.awt.*;
import java.util.Scanner;

public class EmployeeMenu {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        int userChoice;

        System.out.println("\t Employee File");
        System.out.println("----------------");
        System.out.println("Option\t\tDescription");
        System.out.println("------\t\t-----------");
        System.out.println("0\t\t\tExit");
        System.out.println("1\t\t\tEnter a new employee");
        System.out.println("2\t\t\tView an existing employee");
        System.out.println("3\t\t\tDelete an employee");
        System.out.println("4\t\t\tList all employees");
        System.out.println("\nPlease choose an option:");

        userChoice = sc.nextInt();

        switch (userChoice) {

            case 0:
                System.out.println("Exiting the program");
            break;

            case 1:
                System.out.println("Enter a new employee name");
            break;

            case 2:
                System.out.println("Enter a name to view an existing employee");
            break;

            case 3:
                System.out.println("Enter a name to delete an employee");
            break;

            case 4:
                System.out.println("Listing all employees");
            break;
        }
        sc.close();
    }



}




