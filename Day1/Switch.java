import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the fruit ");
        String fruit = sc.next();
        switch (fruit) {
            case "Mango" -> System.out.println("King of fruit");
            case "Apple" -> System.out.println("Apple is red");
            default -> System.out.println("Invalid input");
        }
    }
}
