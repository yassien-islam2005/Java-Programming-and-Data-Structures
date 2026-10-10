package Ch2.Examples;

import java.util.Scanner;

public class ComputeAverage
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double number1, number2, number3;

        System.out.println("Enter three numbers:");
        number1 = input.nextDouble();
        number2 = input.nextDouble();
        number3 = input.nextDouble();

        input.close();

        double average = (number1 + number2 + number3) / 3;
        
        System.out.println("The average of the three numbers: " + number1 + ", " +number2 + ", " + number3 + "is " +
        average);
    }    

}