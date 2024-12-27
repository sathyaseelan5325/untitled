import java.util.Arrays;
import java.util.Scanner;

/// single dimensional array
/*public class types_of_arrays {
    public static void main(String[] args) {

        int[] num={10,20,30,40,50,60,70,80,90};
        System.out.println(num[6]);
        /*char[] name={'s','a','t','h','y','a'};
                for (int i=0;i<=name.length-1;i++)
        {
            System.out.print(name[i]);
        }
    }
}

double[] name={1.9,2.9,3.4,3.5};
for (int i=0;i<name.length-1;i++)
{
    System.out.println(name[i]+" ");
}
        double sum=0;
for (int i=0;i<name.length;i++)
{
    sum+=name[i];
}
        System.out.println("sum is="+sum);
    }
}
       int[] a = {9, 7, 5, 1, 2, 10};
        int max=a[0];
        ///System.out.println(Arrays.stream(a).max());
        for (int i=0;i<a.length;i++)
        {
            if (a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println(max);
        int[] a = {9, 7, 5, 1, 2, 10};
        int min=a[0];
        ///System.out.println(Arrays.stream(a).max());
        /// System.out.println(Arrays.stream(a).min());
        for (int i=0;i<a.length;i++)
        {
            if (a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.println(min);
    }
}


///multi-dimensional array
public class types_of_arrays {
    public static void main(String[] args) {
int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("element of the 2D array");
        for (int i=0;i<matrix.length;i++)
        {
            for (int j=0;j<matrix.length;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}


public class types_of_arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows and columns");
        int row=sc.nextInt();  ///3
        int col=sc.nextInt();  ///3

        int[][] a=new int[row][col];
        int[][] b=new int[row][col];
        int[][] c=new int[row][col];

        System.out.println("enter the elements of first matrix");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println("enter the elements of second matrix");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }

        System.out.println("sum of two matrix");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }

    }
}

public class types_of_arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows and columns");
        int row=sc.nextInt();  ///3
        int col=sc.nextInt();  ///3

        int[][] a=new int[row][col];
        int[][] b=new int[row][col];
        int[][] c=new int[row][col];

        System.out.println("enter the elements of first matrix");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println("enter the elements of second matrix");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }


        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                for(int k=0;k<a.length;k++)
                {
                    c[i][j]=c[i][j]+a[i][k]*b[k][j];
                }
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}


public class types_of_arrays {
public static void main(String[] args) {
    String[] a={"a","y","h","t","a","s"};
        for (int i=0;i<a.length/2;i++)
        {
            int t=a[i];
            a[i]=a[a.length-1-i];
            a[a.length-1-i]=t;
        }
        System.out.println("" + Arrays.toString(a));
    }
}
*/