import java.util.Scanner;
import java.util.*;
public class voting{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age  > 18){
            System.out.println("Adult");
        }else {
            System.out.println("Not Adult");
        }
    }
    
}