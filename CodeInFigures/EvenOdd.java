import javax.swing.*;

public class EvenOdd {
   public static void main(String[] args) {
      int number;
      boolean result;
      String str;


      str = JOptionPane.showInputDialog(null,"Enter an integer");
      number = Integer.parseInt(str);

      if ((number % 2) == 0) {
         JOptionPane.showMessageDialog(null, "the number you entered is even");
      }else
         JOptionPane.showMessageDialog(null, "the number you entered is odd");
   }
}
