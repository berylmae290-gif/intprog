import java.util.Scanner;
public class Timebreaker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalSeconds, hours, minutes, seconds;

        System.out.print("Enter the total number of seconds: ");
        totalSeconds = scanner.nextInt();

        hours = totalSeconds / 3600;
        minutes = (totalSeconds % 3600) / 60;
        seconds = totalSeconds % 60;

        System.out.printf("Converted Time: %02d:%02d:%02d\n", hours, minutes, seconds);

        scanner.close();
    }  
}
