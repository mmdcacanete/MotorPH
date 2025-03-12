import java.util.Scanner;

public class WorkHoursCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for time in
        System.out.print("Enter Time In (0-23): ");
        int timeIn = scanner.nextInt();

        // Ask for time out
        System.out.print("Enter Time Out (0-23): ");
        int timeOut = scanner.nextInt();

        // Calculate work hours
        int workHours;
        if (timeOut >= timeIn) {
            workHours = timeOut - timeIn;  // Same day
        } else {
            workHours = (24 - timeIn) + timeOut;  // Next day
        }

        System.out.println("Total Work Hours: " + workHours);
        scanner.close();
    }
}