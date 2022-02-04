class Largest {

    public static void main(String[] args) {

        double n1 = -7.5, n2 = 3.7, n3 = 5.5;

        if( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the largest ");

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the largest ");

        else
            System.out.println(n3 + " is the largest ");
    }
}