import java.util.Scanner;

class SumCalculator {
    public static void main(String[] args) {
        System.out.println("SUM CALCULATOR");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of values to sum: ");
        int count = input.nextInt();

        int sum = 0;
        for (int i = 1; i <= count; i++) {
            System.out.print("Enter value " + i + ": ");
            int value = input.nextInt();
            sum += value;
        }

        System.out.println("The sum is: " + sum);
    }
}