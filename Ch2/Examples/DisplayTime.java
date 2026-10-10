package Ch2.Examples;

import java.util.Scanner;

public class DisplayTime 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        final int SECONDS_PER_MINUTE = 60;

        System.out.print("Enter total seconds: ");
        int seconds = input.nextInt();

        input.close();

        int minutes = seconds / SECONDS_PER_MINUTE;
        int remainingSeconds = seconds % SECONDS_PER_MINUTE;

        System.out.println(seconds + " = " + minutes + " minutes and " + remainingSeconds + " seconds.");

    }
}
