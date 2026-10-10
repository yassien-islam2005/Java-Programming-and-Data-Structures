// This example is not included in the textbook; I created it to practice using the remainder (%) operator.

package Ch2.Examples;

import java.util.Scanner;

public class DayOfWeekCalculator
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        final int DAYS_PER_WEEK = 7;

        System.out.print("Enter today's day index (0 = Sunday, 1 = Monday, ..., 6 = Saturday): ");
        int currentDayIndex = input.nextInt();

        System.out.print("Enter the number of days to advance: ");
        int daysToAdvance = input.nextInt();

        input.close();

        int targetDayIndex = (currentDayIndex + daysToAdvance) % DAYS_PER_WEEK;

        System.out.println("Target day index: " + targetDayIndex);
    }
}