// This example is not included in the textbook; I created it to practice using the remainder (%) operator.


package Ch2.Examples;

import java.util.Scanner;

public class BoxDistribution 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the total number of items: ");
        int totalNumberOfItems = input.nextInt();

        System.out.print("Enter the maximum number of items per box (must be greater than 0): ");
        int maxNumberOfItemsPerBox = input.nextInt();

        input.close();

        int numberOfCompletedBoxes = totalNumberOfItems / maxNumberOfItemsPerBox;
        int numberOfRemainingItems = totalNumberOfItems % maxNumberOfItemsPerBox;

        System.out.println(totalNumberOfItems + " items = " + 
        numberOfCompletedBoxes + " full boxes and " + numberOfRemainingItems + " individual items.");

    }
}
