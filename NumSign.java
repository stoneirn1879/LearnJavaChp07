import java.util.Scanner;
public class NumSign {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        int number;

        System.out.println("Please enter a number: ");
        number = sc.nextInt();

        if (number > 0) {
            System.out.println(number + " " + "is a positive number!");
        }
        else if (number == 0) {
            System.out.println(number + " " + "your number is Zero!");
        }
        else {
            System.out.println(number + " " + "is a negative number!");
        }

        sc.close();


    }
}
