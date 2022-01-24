import java.util.Scanner;

public class Weekdays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day");
        int day = sc.nextInt();

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("These are weekdays");
            case 6, 7 -> System.out.println("Weekend");
            default -> System.out.println("Invalid Input");
        }

    }
}
