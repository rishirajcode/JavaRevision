import java.util.Scanner;

class Percentage
{
public static void main(String args[])
{
     float eng, phy, chem, math, comp; 
     double total, average, percentage;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter marks of five subjects:");
    System.out.print("Enter marks of English subjects:");
    eng=sc.nextFloat();
    System.out.print("Enter marks of physics subjects:");
    phy=sc.nextFloat();
    System.out.print("Enter marks of chemistry subjects:");
    chem=sc.nextFloat();
    System.out.print("Enter marks of maths subjects:");
    math=sc.nextFloat();
    System.out.print("Enter marks of computers subjects:");
    comp=sc.nextFloat();

    total = eng + phy + chem + math + comp;
    average = (total / 5.0);
    percentage = (total / 500.0) * 100;

    System.out.println("Total marks ="+total);
    System.out.println("Average marks = "+average);
    System.out.println("Percentage = "+percentage);

   }
}