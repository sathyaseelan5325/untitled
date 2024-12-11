import java.util.Scanner;

public class switchstatement_grade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a mark");
        String mark= sc.nextLine();
        switch (mark)
        {
            case "1":
                System.out.println("first grade");
                break;
            case "2":
                System.out.println("second grade");
                break;

            case "3":
                System.out.println("third grade");
                break;

            case "4":
                System.out.println("fourth grade");
                break;

            case "5":
                System.out.println("fifth grade");
                break;

            default :
                System.out.println("you are pass");

        }
    }
}
