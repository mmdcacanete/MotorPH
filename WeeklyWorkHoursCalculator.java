import java.util.Scanner;

public class WeeklyWorkHoursCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalWorkHours = 0;

        // Loop for 5 working days (Monday to Friday)
        for (int day = 1; day <= 5; day++) {
            System.out.println("Day " + day + ":");

            // Ask for time in
            System.out.print("Enter Time In (0-23): ");
            int timeIn = scanner.nextInt();

            // Ask for time out
            System.out.print("Enter Time Out (0-23): ");
            int timeOut = scanner.nextInt();

            // Calculate daily work hours
            int workHours;
            if (timeOut >= timeIn) {
                workHours = timeOut - timeIn;  // Same day
            } else {
                workHours = (24 - timeIn) + timeOut;  // Next day
            }

            totalWorkHours += workHours; // Add to total hours
            System.out.println("Work Hours for Day " + day + ": " + workHours + "\n");
        }

        System.out.println("Total Work Hours for the Week: " + totalWorkHours);
        scanner.close();
    }
}