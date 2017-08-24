import javax.swing.*;
import java.util.Scanner;

public class AscendingAndDescending {
   public static void main(String[] args) {
      int number1, number2, number3, lowest, middle, highest;
      String str;


      Scanner input = new Scanner(System.in);

      System.out.println("Enter an integer");
      number1 = input.nextInt();

      System.out.println("Enter an integer");
      number2 = input.nextInt();

      System.out.println("Enter an integer");
      number3 = input.nextInt();

      if(number1 <= number2 && number1 <= number3){
         lowest = number1;
         if(number2 <= number3){
            middle = number2;
            highest = number3;
         }else{
            middle = number3;
            highest = number2;
         }
      }else{
         if(number2 <= number1 && number2 <= number3){
            lowest = number2;
            if(number1 <= number3){
               middle = number1;
               highest = number3;
            }else{
               middle = number3;
               highest = number1;
            }
         }else{
            lowest = number3;
            if(number1 <= number2){
               middle = number1;
               highest = number2;
            }else{
               middle = number2;
               highest = number1;
            }
         }
      }


      System.out.println( "Ascending: " + lowest + " " + middle + " " + highest + "\nDescending: " + highest + " " + middle + " " + lowest);


   }
}

