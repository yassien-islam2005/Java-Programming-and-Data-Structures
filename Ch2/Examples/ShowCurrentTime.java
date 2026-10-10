package Ch2.Examples;

public class ShowCurrentTime 
{
    public static void main(String[] args) 
    {
        final int MILLISECONDS_PER_SECOND = 1000;
        final int SECONDS_PER_MINUTE = 60;
        final int MINUTES_PER_HOUR = 60;
        final int HOURS_PER_DAY = 24;

        long totalMillseconds = System.currentTimeMillis();
        long totalSeconds = totalMillseconds / MILLISECONDS_PER_SECOND;

        long currentSecond = totalSeconds % SECONDS_PER_MINUTE;
        
        long totalMinutes = totalSeconds / SECONDS_PER_MINUTE;
        long currentMinute = totalMinutes % MINUTES_PER_HOUR;

        long totalHours = totalMinutes / MINUTES_PER_HOUR;
        long currentHour = totalHours % HOURS_PER_DAY;
        
        System.out.println("Current time is " + currentHour + ":"
        + currentMinute + ":" + currentSecond + " GMT");
    }
}