import java.util.Scanner;

public class CharClassSwitch {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        String userInput;
        char character;


        System.out.println("Please enter a single character. It can be a letter, number, or symbol.");
        userInput = sc.next();
        character = userInput.charAt(0);

        switch (character) {

           case '0': case '1': case '2': case '3': case '4':case '5': case '6': case '7': case '8': case '9':
               System.out.println("Your character is a number");
               break;

            case 'A': case 'a': case 'E': case 'e': case 'I':case 'i': case 'O': case 'o': case 'U': case 'u':
                System.out.println("Your character is a vowel");
                break;

            case '!': case '@': case '#': case '$': case '%':case '^': case '&': case '*': case '(': case ')':
            case '-': case '/': case '+': case '=':
                System.out.println("Your character is a symbol");
                break;

            default:
                System.out.println("Your character is not a number, vowel, or symbol");

            sc.close();

        }

    }
}

