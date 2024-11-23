import java.util.Scanner;
public class FindYearWithMinute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of minutes :");
        long minutes = sc.nextLong();
        
        int minutesInDay = 24*60;
        int minutesInYear = 365*minutesInDay;

        long years = minutes / minutesInYear;
        long remainingMinutes = minutes % minutesInYear;
        long days = remainingMinutes / minutesInDay;

        // Display the result
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");



    }
    
}
