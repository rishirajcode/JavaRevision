import java.util.Scanner;
class loop{
    public void ok(int a,int b,int c){
        for (int j=0;j<c;j++){
                a+=(int)Math.pow(2,j)* b; 
                System.out.print(a+" ");
        }
    }
}
public class loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            Operation obj= new Operation();
            obj.ok(a,b,c);
            System.out.println();
        }
    }
}