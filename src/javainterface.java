/*interface animal
{
    int a=10;
    int b=8;
    public void add();
    public void sub();
}
class abc implements animal
{
    public void add()
    {
        System.out.println("hai");
    }

    public void sub()
    {
        System.out.println("hello");
    }
}
public interface javainterface {
    public static void main(String[] args) {
        abc obj=new abc();
        obj.add();
        obj.sub();
        System.out.println(animal.a+animal.b);
    }
}
*/
/*interface a
{
    public void add(int q,int w);
    public void mul(int q,int w);

}
interface b extends a
{
    public void sub(int q,int w);
    public void div(int q,int w);
}
class abc implements b
{
    public void add(int q,int w)
    {
        System.out.println(q+w);
    }
    public void mul(int q,int w)
    {
        System.out.println(q*w);
    }
    public void sub(int q,int w)
    {
        System.out.println(q-w);
    }
    public void div(int q,int w)
    {
        System.out.println(q/w);
    }
}
public interface javainterface {
    public static void main(String[] args) {
        abc obj=new abc();
        obj.add(5,6);
        obj.mul(7,8);
        obj.sub(8,9);
        obj.div(9,3);
    }
}
*/
interface a
{
    int q=10;
    int w=16;
    public void add();
    public void mul();

}
class b implements a
{
    public void add()
    {
        System.out.println("hai");
    }
    public void mul()
    {
        System.out.println("helloo");
    }
}
class abc extends b
{
    public void sub(int q,int w)
    {
        System.out.println(q-w);
    }
    public void div(int q,int w)
    {
        System.out.println(q/w);
    }

}
public interface javainterface {
    public static void main(String[] args) {
        abc obj=new abc();
        obj.add();
        obj.mul();
        System.out.println(a.q+b.w);
        obj.sub(30,9);
        obj.div(9,3);
    }
}
