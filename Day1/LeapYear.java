import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Year");
        int year = input.nextInt();
        if(year % 4 == 0){
            System.out.println("The year is Leap");
        }
        else{
            System.out.println("Not a Leap year");
        }
    }
    
}
