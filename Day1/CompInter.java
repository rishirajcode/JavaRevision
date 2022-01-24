import java.util.Scanner ;
import java.security.Principal;

public class CompInter {
    public static void main(String[] args) {
        double Amount, ci;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Principal");
        double p = input.nextDouble();
        System.out.println("Enter The Rate Of Interest");
        float r = input.nextFloat();
        System.out.println("Enter the time Period");
        float t = input.nextFloat();
        Amount = p *
        (Math.pow((1 + r / 100), t));
        System.out.println("Amount is: " + Amount);
        ci = Amount - p;
        System.out.println("Compound Int. is "+ci);
    }
    
}
