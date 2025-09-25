package chapter3;
/* 
import java.util.Scanner;

public class ComputeAreaWithconsoleInput {
   public ComputeAreaWithconsoleInput() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter a number for radius: ");
      double var2 = var1.nextDouble();
      double var4 = var2 * var2 * 3.14159;
      System.out.println("The area of the circle of radius " + var2 + " is " + var4);
      var1.close();
   }
}
    */
/*This is the original code from chapter to for finding the area
 * when finding an area you dont want to use a negative number
 * but what if someone types in a negative number?
 * thats when selection statements come in
 */


import java.util.Scanner;

public class ComputeAreaWithSelectionStatement {
    // start a method 
    public static void main(String[] args) {
        // create a scanner
        Scanner userInput = new Scanner(System.in);
        // assign pi, use final so it cant be changed
        final double PI = 3.14159;
        // prompt user for input
        System.out.println("Enter a number for the Radius: ");
        // assign user input to radius
        double radius = userInput.nextDouble();
        
        // write a selection statement
        if (radius < 0) {
            System.out.println("Incorrect input");
        }
        else {
            double area = radius * radius * PI;
            System.out.println("Area is " + area);
        }
        userInput.close();

    }
}
