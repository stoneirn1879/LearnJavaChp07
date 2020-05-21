import java.util.Scanner;

public class IfCelsFahr {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        String scale;
        int temperature;

        System.out.println("Please enter your temperature: ");
        temperature = sc.nextInt();

        System.out.println("Please enter your temperature scale: C/F ");
        scale = sc.next();


        switch(scale)
            {
                case "C":
                    System.out.println("The temperature is " + temperature + scale);
                break;

                case "F":
                    System.out.println("The temperature is " + temperature + scale);
                break;

            }


        sc.close();


    }
}
