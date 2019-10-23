import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = scan.nextInt();
        String monthName;
        switch (days) {
            case 30:
                monthName = "September April June November";
                break;
            case 31:
                monthName = "January March May July August October December";
                break;
            case 29:
                monthName = "February";
                break;
            default:
                monthName = "Unknown";
                break;
        }
        System.out.println(monthName);
    }
}