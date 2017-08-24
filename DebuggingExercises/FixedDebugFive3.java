// DebugFive3.java
// Determines whether item number on order is valid
// Over 999 invalid
// Less than 111 Invalid
// Valid and less than 500 - Automotive Department
// Valid and 500 or higher Housewares Department
import java.util.Scanner;
public class FixedDebugFive3
{
   public static void main (String args[])
   {
      int item;
      String output;
      final int LOW = 111;
      final int HIGH = 999;
      final int CUTOFF = 500;
      Scanner input = new Scanner(System.in);
      System.out.println("Please enter item number");
      item = input.nextInt();
      if(item <= LOW) {
          System.out.println("Item number too low");
      }else if(item >= HIGH){
          System.out.println("Item number too high");
      }else if(item > LOW && item < CUTOFF){
          System.out.println("Valid - in Automotive Department");
      }else if(item < HIGH && item >= CUTOFF) {
          System.out.println("Valid - Item in Housewares Department");
      }
   }
}


