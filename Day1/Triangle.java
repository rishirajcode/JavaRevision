import java.util.Scanner;   
public class L1Q3 {
    public static void main(String[] args) {
        int base, altitude;
        System.out.println("Enter the Sides of Altitude");
        Scanner sc = new Scanner(System.in);
        altitude = sc.nextInt();
        System.out.println("Enter the base ");
        base = sc.nextInt();
        int area = (base*altitude)/2;
        System.out.println("The are of Triangle is " +area );
    }
    
}
