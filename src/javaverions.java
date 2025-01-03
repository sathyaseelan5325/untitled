import java.time.*;
import java.util.Arrays;
import java.util.List;

/*interface I
{
   default void phone()
  {
      System.out.println("phone1");
  }
}

class A
{
    void phone()
    {
        System.out.println("phone3");
    }
}
public class demo1 extends A {
    public static void main(String[] args) {
        demo1 obj =new demo1();
        obj.phone();

    }
}
*/
/*interface J3
{
    static void phone()
    {
        System.out.println("phone2");
    }
}
public class demo1{
    public static void main(String[] args) {
        J.phone();

    }
}


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class demo1{
    public static void main(String[] args) {
        List<Integer> values= Arrays.asList(11,22,33,44);
       /* for (int i=0;i< values.size();i++)
        {
            System.out.println(values.get(i));
        }*/
       /* for (int i:values)
        {
            System.out.println(i);
        }

        values.forEach( i -> System.out.println(i));//java 8 (for each method)

    }
}
*/
/*
class demo5 implements Consumer<Integer>
{
    public void accept(Integer i)
    {
        System.out.println(i);
    }
}
public class demo1{
    public static void main(String[] args) {
        List<Integer> values= Arrays.asList(1,2,3,4,5);
        Consumer<Integer> c=new demo5();
        values.forEach(c);
    }
}
*/
/*
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
// using anonymous class
public class demo1 {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5);

        Consumer<Integer> c = new Consumer<Integer>()
        {
            public void accept(Integer i) {
                System.out.println(i);
            }
        };

        values.forEach(c);
    }
}
*/
/*
//using a lamda function
public class demo1 {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5);

        Consumer<Integer> c = (i) -> System.out.println(i); //java 8 feature lamda expression

        values.forEach(c);
    }
}

//stream api (filter,map,reduce)
public class javaversions {
    public static void main(String[] args) {
        List<Integer> values=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Predicate<Integer> p=new Predicate<Integer>()
        {
            public boolean test(Integer i) {
                return i%2==0;
            }
        };
        Function<Integer,Integer> f=new Function<Integer, Integer>()
        {
            public Integer apply(Integer j) {
                return j*2;
            }
        };
        BinaryOperator<Integer> b=new BinaryOperator<Integer>()
        {
            public Integer apply(Integer i, Integer j)
            {
                return i+j;
            }
        };
        Stream<Integer> s=values.stream();
        Stream s1=s.filter(p);
        Stream s2=s1.map(f);
        int result=(Integer) s2.reduce(0,b);
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(result);
    }
}

//version2 anonmys function
public class demo4 {
    public static void main(String[] args) {
        List<Integer> values= Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Stream<Integer> s=values.stream();
        Stream s1=s.filter(i%2==0);
        Stream s2=s1.map(i*2);
        int result=(Integer) s2.reduce(0,i+j);
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(result);
    }
}

//version3 lamda expression
public class javaverions {
    public static void main(String[] args) {
        List<Integer> values= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println(values.stream().filter(i->i%2==0).map(i->i*2).reduce(0,(i,j)->i+j));
    }
}
 */
public class javaverions {
    public static void main(String[] args) {
        // LocalDate d=LocalDate.now();
        // LocalDate d=LocalDate.of(2001,05,01);
        // LocalDate d=LocalDate.of(2001, Month.MAY,01);
        //LocalDate d=LocalDate.of(2004, Month.FEBRUARY,29);
        //LocalTime d=LocalTime.now();
        //LocalTime d=LocalTime.of(8,59,59,999876543);
        LocalTime d=LocalTime.now(ZoneId.of("Indian/Christmas"));
        System.out.println(d);
        for (String s: ZoneId.getAvailableZoneIds())
        {
            System.out.println(s);
        }
       //LocalDateTime d=LocalDateTime.now();

    }
}