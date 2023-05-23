import java.util.Scanner;

class Project1 {
    public static void main(String[] args) {

        System.out.println("PROGRAM THAT PRINTS THE SUM!");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ") ;
        int A = input.nextInt();

        System.out.println ("Enter the second number: ");
        int B = input.nextInt();

        int sum = A + B;

        System.out.println(sum);

    }
}

