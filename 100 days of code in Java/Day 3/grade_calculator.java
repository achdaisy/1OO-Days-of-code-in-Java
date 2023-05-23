import java.util.Scanner;

public class grade_calculator {

   //This  calculator is used to find out the grade of a course based on weighted averages
   public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
       System.out.println("Please enter the number of scores: " );
       int no_of_scores = input.nextInt();


       int sum = 0;

//  GUESS MY CODE NEEDS SOME ARRAYS I ORDER TO WORK PROPERLY
       for (i=1; i <= no_of_scores; i++){

           System.out.println("Enter score: " );
           int score = input.nextInt();

           sum += score;

           System.out.println("The total score is: " +sum);
       }

   }


}
