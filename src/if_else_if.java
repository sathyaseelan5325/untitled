import java.util.Scanner;

public class if_else_if {
    public static void main(String[] args) {
      /*  int a=19;
        int b=18;
        int c=20;
        if (a>=b && a>=c)
        {
            System.out.println(a+" "+"is largest");
        }
        else if (b>=a && b>=c)
        {
            System.out.println(b+" "+"is largest");
        }
        else
        {
            System.out.println(c+" "+"is largest");
        } */

        Scanner sc=new Scanner(System.in);
        System.out.println("enter a value");
        int a=sc.nextInt();
        System.out.println("enter b value");
        int b=sc.nextInt();
        System.out.println("enter c value");
        int c=sc.nextInt();

        if (a>=b && a>=c)
        {
            System.out.println(a+" "+"is largest");
        }
        else if (b>=a && b>=c)
        {
            System.out.println(b+" "+"is largest");
        }
        else
        {
            System.out.println(c+" "+"is largest");
        }
    }


}
