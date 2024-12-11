import java.util.Scanner;

public class nested_if_else {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a mark");
        int a=sc.nextInt();
        /*System.out.println("enter b value");
        int b=sc.nextInt();
        System.out.println("enter c value");
        int c=sc.nextInt();*/

        if (a>=79)
        {
            if (a>=90)
            {
                System.out.println(a+" "+"a is 1 grade");
            }
            else
            {
                System.out.println(a+" "+"b is 2 grade");
            }
        }
        else
        {
            if (a>=70)
            {
                System.out.println(a+" "+"c is 3 grade");
            }
            else
            {
                System.out.println(a+" "+"d is pass");
            }
        }
    }
}
