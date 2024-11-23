import java.util.Scanner;

public class DisplayCalendar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for year and the first day of the year
        System.out.print("Enter the year (e.g., 2024): ");
        int year = scanner.nextInt();

        System.out.print("Enter the first day of the year (0 for Sunday, 1 for Monday, ..., 6 for Saturday): ");
        int firstDay = scanner.nextInt();

        // Array to store the number of days in each month
        int[] daysInMonth = {
            31, // January
            isLeapYear(year) ? 29 : 28, // February
            31, // March
            30, // April
            31, // May
            30, // June
            31, // July
            31, // August
            30, // September
            31, // October
            30, // November
            31  // December
        };

        // Array of month names
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };

        // Loop through each month
        for (int month = 0; month < 12; month++) {
            // Print the header for the month
            System.out.println("\n" + months[month] + " " + year);
            System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");

            // Calculate the indentation for the first day of the month
            for (int i = 0; i < firstDay; i++) {
                System.out.print("\t");
            }

            // Print the days of the month
            for (int day = 1; day <= daysInMonth[month]; day++) {
                System.out.print(day + "\t");
                // Move to the next line after Saturday
                if ((day + firstDay) % 7 == 0) {
                    System.out.println();
                }
            }

            // Update the first day for the next month
            firstDay = (firstDay + daysInMonth[month]) % 7;
            System.out.println(); // Add extra line after each month
        }
    }

    // Method to determine if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
