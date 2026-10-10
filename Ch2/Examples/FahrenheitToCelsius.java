package Ch2.Examples;

//Rule: Celsius = ( 5 / 9 ) (Fahrenheit - 32).

import java.util.Scanner;

public class FahrenheitToCelsius 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the temperature in fahrenheit: ");
        double fahrenheit = input.nextDouble();

        input.close();

        double celsius = (5.0D / 9) * (fahrenheit - 32);

        System.out.println(fahrenheit + " fahrenheit = " + celsius + " celsius.");

    }
}
