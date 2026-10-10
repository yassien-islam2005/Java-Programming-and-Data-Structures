package Ch2.Examples;

import java.util.Scanner;

public class SalesTax 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter purchase amount: ");
        double purchaseAmount = input.nextDouble();

        input.close();

        double tax = purchaseAmount * 0.06D;
        System.out.println("Sales tax is $" + (int)(tax * 100) / 100.0D);
        System.out.println("Sales tax is $" + (int)(tax * 100 + 0.5) / 100.0D); //Rounding the result up to two decimal points
        
    }
}
