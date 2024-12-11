import java.util.Scanner;

public class parctice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number of rows");
        int row= sc.nextInt();  //5
        /*for (int i=0;i<=row;i++)
        {
            for (int j=0;j<row;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }*/
                /// *****
               /*for (int i=0;i<5;i++)
                {
                    for (int j=0;j<i;j++)
                    {
                        System.out.print(" ");
                    }
                    for (int j=i;j<5;j++)
                    {
                        System.out.print("*");
                    }
                    System.out.println();
                }*/

        for (int i=0;i<row;i++)
        {
            for (int j=0;j<row-i-1;j++)
            {
                System.out.print(" ");
            }
            for (int j=0;j<=i;j++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }

            }
        }
