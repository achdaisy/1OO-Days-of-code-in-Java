import java.util.Scanner;

public class USD_to_Ksh {


            //Program that Converts one currency to another
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                System.out.println("Enter the current rate of conversion ");
                double rate = input.nextDouble();

                System.out.println("Enter the value of the currency to be converted ");
                double currencyA = input.nextDouble();

                double currencyB = rate * currencyA;

                System.out.println("The value of the currency is " +currencyB);
            }
}
