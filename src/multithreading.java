/*class ready extends Thread
{
    public void run()
    {
        for(int i=0;i<=0;i++)
        {
            try {Thread.sleep(1000);}
            catch (Exception e) {}
            System.out.println("3");

        }
    }
}
class steady extends Thread
{
    public void run()
    {
        for(int i=0;i<=0;i++)
        {
            try {Thread.sleep(2000);}
            catch (Exception e) {}
            System.out.println("2");

        }
    }
}
class set extends Thread
{
    public void run()
    {
        for(int i=0;i<=0;i++)
        {
            try {Thread.sleep(3000);}
            catch (Exception e) {}
            System.out.println("1");

        }
    }
}
class go extends Thread
{
    public void run()
    {
        for(int i=0;i<=0;i++)
        {
            try {Thread.sleep(4000);}
            catch (Exception e) {}
            System.out.println("Go");

        }
    }
}
public class multithreading {
    public static void main(String[] args) {
        steady obj=new steady();
        ready obj1=new ready();
        set obj2=new set();
        go obj3=new go();
        obj1.start();
        obj.start();
        obj2.start();
        obj3.start();
    }
}

class degree extends Thread
{
    public void run()
    {
        for(int i=0;i<=1;i++)
        {
            System.out.println("Kalasalingam university");
            try {Thread.sleep(1000);}
            catch (Exception e) {}
        }
    }
}
class intern extends Thread
{
    public void run()
    {
        for(int i=0;i<=1;i++)
        {
            System.out.println("railnet in madurai");
            try {Thread.sleep(2000);}
            catch (Exception e) {}
        }
    }
}
class school extends Thread
{
    public void run()
    {
        for(int i=0;i<=1;i++)
        {
            System.out.println("lions school in pmk");
            try {Thread.sleep(3000);}
            catch (Exception e) {}
        }
    }
}

public class multithreading {
    public static void main(String[] args) {
        degree obj=new degree();
        intern obj1=new intern();
        school obj2=new school();
        obj2.start();
        obj.start();
        obj1.start();


    }
}
*/
class ready implements Runnable
{
    public void run()
    {
        for(int i=0;i<=0;i++)
        {
            try {Thread.sleep(1000);}
            catch (Exception e) {}
            System.out.println("3");

        }
    }
}
class steady implements Runnable
{
    public void run()
    {
        for(int i=0;i<=0;i++)
        {
            try {Thread.sleep(2000);}
            catch (Exception e) {}
            System.out.println("2");
        }
    }
}
class set implements Runnable
{
    public void run()
    {
        for(int i=0;i<=0;i++)
        {
            try {Thread.sleep(3000);}
            catch (Exception e) {}
            System.out.println("1");
        }
    }
}
class go implements Runnable
{
    public void run()
    {
        for(int i=0;i<=0;i++)
        {
            try {Thread.sleep(4000);}
            catch (Exception e) {}
            System.out.println("Go");
        }
    }
}
public class multithreading {
    public static void main(String[] args) {
        steady obj=new steady();
        ready obj1=new ready();
        set obj2=new set();
        go obj3=new go();
        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj1);
        Thread t3=new Thread(obj2);
        Thread t4=new Thread(obj3);
        t1.start();
        t3.start();
        t2.start();
        t4.start();
    }
}