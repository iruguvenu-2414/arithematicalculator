// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class arithematicalculator {
   public arithematicalculator() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter the first number: ");
      double var2 = var1.nextDouble();
      System.out.print("Enter the second number: ");
      double var4 = var1.nextDouble();
      System.out.print("Choose an operation (+, -, *, /): ");
      char var6 = var1.next().charAt(0);
      double var7;
      switch (var6) {
         case '*':
            var7 = var2 * var4;
            System.out.printf("Result: %.2f * %.2f = %.2f%n", var2, var4, var7);
            break;
         case '+':
            var7 = var2 + var4;
            System.out.printf("Result: %.2f + %.2f = %.2f%n", var2, var4, var7);
            break;
         case ',':
         case '.':
         default:
            System.out.println("Invalid operation. Please choose +, -, *, or /.");
            break;
         case '-':
            var7 = var2 - var4;
            System.out.printf("Result: %.2f - %.2f = %.2f%n", var2, var4, var7);
            break;
         case '/':
            if (var4 != 0.0) {
               var7 = var2 / var4;
               System.out.printf("Result: %.2f / %.2f = %.2f%n", var2, var4, var7);
            } else {
               System.out.println("Error: Division by zero is not allowed.");
            }
      }

      var1.close();
   }
}
