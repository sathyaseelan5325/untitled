import java.util.Scanner;

public class loop_nested {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number of rows and col");
        int row= sc.nextInt();
        int col= sc.nextInt();
        for (int i=0;i<=row;i++)   /// outer loop
        {
            for (int j=0;j<=col;j++)  /// inner loop
            {
                System.out.print(i+"  "+j);
            }
            System.out.println();
        }
    }
}
