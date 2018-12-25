/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internetsavings;
import javax.swing.JOptionPane;
/**
 *
 * @author chinonsoobidike
 */
public class InternetSavings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input;
      char servicePackage;
      char service;
      double hours, rateA, rateB,rateC, bill, extraHours, saveB, saveC;
      rateA = 9.95;
      rateB = 13.95;
      rateC = 19.95;
      JOptionPane.showMessageDialog(null, "We provide three service packages: "
              + "\nrate A: $9.95\nrate B: $13.95\nrate C: $19.95\n"
              +"Click ok to continue");
      
      input = JOptionPane.showInputDialog("Enter the letter of the package you use");
      input = input.toUpperCase();
      service = input.charAt(0);
      while(service > 'C'){
       input =  JOptionPane.showInputDialog("You entered a wrong letter.\nEnter a letter from A to C");
   input = input.toUpperCase();
   service = input.charAt(0);
   }
      servicePackage = input.charAt(0);
      input =  JOptionPane.showInputDialog("Enter the number of hours you used");
      hours = Double.parseDouble (input);
      switch(servicePackage)
      {
         case 'A':
            {
               extraHours = hours - 10;
               if(hours <= 10)
               {
                  bill = rateA;
                  JOptionPane.showMessageDialog(null, String.format("Your bill is $%.2f \n",bill));
               }
               else
               {
                  bill = (rateA + (2 * extraHours));
                  JOptionPane.showMessageDialog(null, String.format("Your bill is $%.2f \n",bill));
               
                  if(bill > rateB)
                  {
                     saveB = bill - rateB;
                    JOptionPane.showMessageDialog(null, String.format("Switch to package "
                            + "B and save $%.2f \n", saveB));
                  }
                  if(bill > rateC)
                  {
                     saveC = bill - rateC; 
                    JOptionPane.showMessageDialog(null, String.format("Switch to package "
                            + "C and save $%.2f \n", saveC));
                  }
               }
               break;
            
            }
         case 'B':
            {
               extraHours = hours - 20;
               if(hours <= 20)
               {
                  bill = rateB;
                  JOptionPane.showMessageDialog(null, String.format("Your bill is $%.2f \n",bill));
               }
               else
               {
                  bill = (rateB + (1 * extraHours));
                  JOptionPane.showMessageDialog(null, String.format("Your bill is $%.2f \n",bill));
                  if(bill > rateC)
                  {
                     saveC = bill - rateC; 
                   JOptionPane.showMessageDialog(null, String.format("Switch to package C and save "
                             + "$%.2f \n", saveC));
                  }
               }
               break;
            }
         case 'C':
            {
               bill = rateC; 
               JOptionPane.showMessageDialog(null, String.format("Your bill is $%.2f \n",bill));
               break;
            }
            
      }
      
      System.exit(0);
    }
    
}
