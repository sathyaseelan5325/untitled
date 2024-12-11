/*abstract class shape
{
 abstract void draw();
}
class circle extends shape
{
    void draw()
    {
        System.out.println("drawing a circle");
    }
}

public class abstraction_class {
    public static void main(String[] args) {
        circle circle=new circle();  ///create a classname classname=new classname
        circle.draw();
    }
}
*/

/*abstract class s1
{
    abstract void add(int a,int b);
    abstract void sub(int a,int b);
    abstract void div(int a,int b);
    abstract void mul(int a,int b);
}
class circle extends s1
{
    void add(int a,int b)
    {
        System.out.println("drawing a add"a+b);
    }
}
    void sub(int a,int b)
    {
        System.out.println("drawing a sub"a-b);
    }

 void div(int a,int b)
    {
        System.out.println("drawing a div"a/b);
    }

    void mul(int a,int b)
    {
        System.out.println("drawing a mul"a*b);
    }
}

public class abstraction_class {
    public static void main(String[] args) {
        circle obj=new circle();
        circle.add(3,8);
        circle.sub(3,8);
        circle.div(3,8);
        circle.mul(3,8);
    }
}
*/

/*abstract class shape
{
    abstract void add();
    abstract void sub();
    abstract void div();
    abstract void mul();
}
class circle extends shape
{
    void add()
    {
        int a=20;
        int b=2;
        System.out.println(a+b);
    }
    void sub()
    {
        int a=20;
        int b=2;
        System.out.println(a-b);
    }
    void div()
    {
        int a=20;
        int b=2;
        System.out.println(a/b);
    }
    void mul()
    {
        int a=20;
        int b=2;
        System.out.println(a*b);
    }
}

public class abstraction_class {
    public static void main(String[] args) {
        circle circle=new circle();
        circle.add();
        circle.sub();
        circle.div();
        circle.mul();
    }
}
*/
/*
abstract class work
{
    abstract void od(int id,int loginhours);
}
class def extends work
{
    void od(int id,int loginhours)
    {
        System.out.println("id number="+id);
        System.out.println("login hours= "+loginhours);
    }
    void officeworkdetails(int readinghours,int sleephours)
    {
        System.out.println("per day readinghours="+readinghours);
        System.out.println("sleeping hours= "+sleephours);
    }
    def(String name,int age)
    {
        System.out.println("your name="+name);
        System.out.println("your age="+age);
    }
}
public class abstraction_class {
    public static void main(String[] args) {
            def obj=new def("sathya",23);
            obj.od(23456,8);
            obj.officeworkdetails(2,7);

    }
}
*/
abstract class vechile
{
    abstract void start();

}