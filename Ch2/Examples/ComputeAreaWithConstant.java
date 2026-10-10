package Ch2.Examples;

import java.util.Scanner;

public class ComputeAreaWithConstant 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        final double PI = 3.14159;

        System.out.print("Enter the radius of the circle to get it's area: ");
        double radius = input.nextDouble();

        input.close();

        double area = radius * radius * PI;

        System.out.println("A circle with radius: " + radius + "has area: " + area);


    }
}
