///declartion of method (access modifier,return type,method name,parameter list)
///calling a method (method name,arguments)
/*class demo
{
    public void greet()
    {
        System.out.println("hai");
    }
}
public class methods_calling {
    public static void main(String[] args) {
        demo obj1=new demo();
        obj1.greet();
    }
}*/
/*class demo
{
    public void add(int a,int b)
    {
        System.out.println("add="+(a+b));
    }
    public int sub(int a,int b)
    {
        return a-b;
    }
}
public class methods_calling {
    public static void main(String[] args) {
        demo obj1 = new demo();
        obj1.add(4,5);
        int result = obj1.sub(4, 2);
        System.out.println("sub=" + result);
    }
}
*/

import java.util.SplittableRandom;

/*class demo
{
    public void add(int a,int b)
    {
        System.out.println("add="+(a+b));
    }
    public void mul(int a,int b) {
        System.out.println("multiple=" + (a * b));
    }
    public int sub(int a,int b)
    {
        return a-b;
    }
    public int div(int a,int b)
    {
        return a/b;
    }
}
public class methods_calling {
    public static void main(String[] args) {
        demo obj1 = new demo();
        demo obj2 = new demo();
        obj1.add(10,5);
        obj2.mul(4,5);
        int result = obj1.div(18, 2);
        int result1 = obj1.sub(18, 9);
        System.out.println("sub=" + result);
        System.out.println("division=" + result1);

    }
}
*/
/*class demo
{
    public void s1(String name, int age, String branch)
    {
        System.out.println("----s1 details-----");
        System.out.println("name=" + " " + name);
        System.out.println("age="+age);
        System.out.println("brach="+branch);
    }

    public void s2(String name, int age, String branch,int Rollno)
    {
        System.out.println("----s2 details-----");
        System.out.println("name="+ name);
        System.out.println("age="+age);
        System.out.println("branch="+branch);
        System.out.println("roll number="+Rollno);
    }

    public void t1(String name, int age)
    {
        System.out.println("----t1 details-----");
         System.out.println("name="+name);
        System.out.println("age="+age);
    }
}
public class methods_calling {
    public static void main(String[] args) {
        demo obj1 = new demo();
        obj1.s1("sathya",23,"MCA");
        obj1.s2("kishore",22,"cs",991801821);
        obj1.t1("ram",32);

    }
}*/
class demo {
    public void emp(String ename, int eID, int salary, String Erole) {
        System.out.println("----Emp details-----");
        System.out.println("Employee name=" + " " + ename);
        System.out.println("Employee id=" + eID);
        System.out.println("Employee salary=" + salary);
        System.out.println("Employee role=" + Erole);
    }

    public void dep(String dname, int id, int noemployee, int depno) {
        System.out.println("----Dep details-----");
        System.out.println("Dep name=" + dname);
        System.out.println("Dep id=" + id);
        System.out.println("Dep no.of.emp=" + noemployee);
        System.out.println("Dep no=" + depno);
    }
}
    public class methods_calling {
        public static void main(String[] args) {
            demo obj1 = new demo();
            obj1.emp("sathya", 235689, 50000, "full stack");
            obj1.dep("TATA STRIVE", 2298785, 450, 991801821);


        }
    }
///declartion of method (access modifier,return type,method name,parameter list)
///calling a method (method name,arguments)