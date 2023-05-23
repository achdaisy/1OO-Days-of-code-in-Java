
import java.util.Scanner;

public class all_math_operations {
       //This code performs all mathematical operations specified by the user ad it uses the switch statement for that
    //  It's also kind of an emulation of  Safaricom's menu interactions with the USSD

    public static void main(String[] args) {


        System.out.println("Welcome to the all operations calculator. pick a number that corresponds to the operation you wat to perform");
        System.out.println("1. Addition ");
        System.out.println("2. subtraction ");
        System.out.println("3. Multiplication ");
        System.out.println("4. Division \n ");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number chosen: 7" +
                "");
        int operation = input.nextInt();

        System.out.println("Enter the first number: ");
        int A = input.nextInt();

        System.out.println("Enter the second number: ");
        int B = input.nextInt();

        int result;

        switch (operation) {
            case 1:
                result = A + B;
                System.out.println(result);
                break;

            case 2:
                result = A - B;
                System.out.println(result);
                break;

            case 3:
                result = A * B;
                System.out.println(result);
                break;

            case 4:
                result = A / B;
                System.out.println(result);
                break;

            default:
                System.out.println("Invalid operation, ensure you enter the correct numbers of the operations");


        }
    }

    };