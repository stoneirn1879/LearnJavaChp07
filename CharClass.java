import java.util.Scanner;

public class CharClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String userInput;

        System.out.println("Please enter a single character. It can be a letter, number, or symbol.");
        userInput = sc.next();

        if (Character.isDigit(userInput.charAt(0))) {
            System.out.println("Your character is a number: " + userInput);

        } else if (Character.isLetter(userInput.charAt(0))) {
            System.out.println("Your character is a letter: " + userInput);

        } else {

            System.out.println("Your character is a symbol: " + userInput);
            }

            sc.close();

        }

    }
