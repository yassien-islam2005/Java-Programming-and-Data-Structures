package Ch2.Examples;

import java.util.Scanner;

public class ComputeAreaWithConsoleInput
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: "); //Prompt
        double radius = input.nextDouble();

        input.close();

        double area = radius * radius * 3.14;

        System.out.println("A circle with radius: " + radius + "has area: " + area);

    }
}
