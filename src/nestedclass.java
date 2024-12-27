/*class q
{
    public void add(int a,int b)
    {
        int e=a+b;
        System.out.println("addition="+e);
    }
    class w
    {
        public void sub(int c,int d)
        {
            int f=c-d;
            System.out.println("subtraction="+f);
        }
    }
}
public class nestedclass {
    public static void main(String[] args) {
        q obj=new q();
        q.w obj1=obj.new w();
        obj.add(5,10);
        obj1.sub(9,3);
    }

}

class q
{
    public void person(String name,int age)
    {
        System.out.println("---person details----");
        System.out.println("my name is="+name);
        System.out.println("my age is="+age);
    }
    class w
    {
        public void emp(int id,String name,int salary)
        {
            System.out.println("---employee details----");
            System.out.println("id no is="+id);
            System.out.println("name is="+name);
            System.out.println("salary is="+salary);
        }
        public void dep(int id,String name)
        {
            System.out.println("---dep details----");
            System.out.println("id no is="+id);
            System.out.println("name is="+name);
        }
        public void hr(String name,String location)
        {
            System.out.println("---HR details----");
            System.out.println("name is="+name);
            System.out.println("work area="+location);
        }
    }
}
public class nestedclass {
    public static void main(String[] args) {
        q obj=new q();
        q.w obj1=obj.new w(); //q is outside class and w is inside class to create a new obj for w
        obj.person("sathya",23);
        obj1.emp(45689,"ram",45000);
        obj1.dep(3456789,"kishore");
        obj1.hr("srinivas","chennai");
    }

}
 */