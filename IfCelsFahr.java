import java.util.Scanner;

public class IfCelsFahr {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        String scale;
        int temperature;
        int displayTemp;

        System.out.println("Please enter your local temperature: ");
        temperature = sc.nextInt();

        System.out.println("Please enter your local temperature scale: C/F ");
        scale = sc.next();

        if (scale.equals("C")) {

            displayTemp = (temperature * 9/5) + 32;
            System.out.println(temperature + "C = " + displayTemp + "F");
        }

        else if (scale.equals("F")) {

            displayTemp = (temperature * 5/9) - 32;
            System.out.println(temperature + "F = " + displayTemp + "C");
        }

        else {
            System.out.println("Please enter your temperature in degrees followed by desired scale C/F");
        }

        sc.close();


    }
}
