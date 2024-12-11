import java.util.Scanner;

public class scanner_user_data_get_code
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /// Reads a int value from the user
       /* System.out.println("Enter a val:");
        int a=sc.nextInt();
        System.out.println("Enter b val:");
        int b=sc.nextInt();
        int c=a+b;
        System.out.println(c); */

        /// Reads a string and int value from the user
       /* System.out.println("enter a name:");
        String name=sc.nextLine();
        System.out.println("enter a age:");
        int age=sc.nextInt();
        System.out.println(name+" "+age); */

        /// details
       System.out.println("enter a first name:");
        String fname=sc.nextLine();
        System.out.println("enter a last name:");
        String lname=sc.nextLine();
        System.out.println("enter a college name:");
        String cname=sc.nextLine();
        System.out.println("enter a branch:");
        String branch=sc.nextLine();
        System.out.println("enter a mobile number:");
        long mobile=sc.nextLong();
        System.out.println("enter a age:");
        int age=sc.nextInt();
        System.out.println(fname+" "+lname+" "+cname+" "+branch+" "+mobile+" "+age);


    }
}
