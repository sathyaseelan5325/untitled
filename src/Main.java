import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number of rows");
        int row = sc.nextInt();  //5
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < row; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}