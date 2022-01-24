import java.util.Scanner;
public class SI {
    public static void main(String[] args) {
        double si = 0 ;
        Scanner imput = new Scanner(System.in);
        System.out.println("Enter Principal");
        float Principal = imput.nextFloat();
        System.out.println("Enter Rate of interest");
        double rate = imput.nextDouble();
        System.out.println("Enter Time Period");
        float time = imput.nextFloat();

        si = (Principal*rate*time)/100 ;
        System.out.println("Simple Interest is: " + si);
    }
    
}
