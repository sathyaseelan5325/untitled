import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      /*  System.out.println("enter your age");
        int age=sc.nextInt();
        if (age>=18)
        {
            System.out.println("eligibale for vote");
        }
        else
        {
            System.out.println("better try next year");
        } */

        /// odd or even number program
        System.out.println("enter a year");
        int year=sc.nextInt();
        if (year%4==0 && year%100!=0 || year%400==0)
        {
            System.out.println("leap year");
        }
        else
        {
            System.out.println("not leap year");
        }
    }
}
