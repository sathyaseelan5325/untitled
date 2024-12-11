/*class a
{
    public void s1()
    {
        System.out.println("parent class");
    }
}
class b extends a
{
    public void s2()
    {
        System.out.println("child1 class");
    }
}
class c extends a
{
    public void s3()
    {
        System.out.println("child2 class");
    }
}
public class inhertance_heiracal {
    public static void main(String[] args) {
        b obj=new b();
        c obj1=new c();
        obj1.s3();
        obj1.s1();
        obj.s2();
        obj.s1();

    }
}*/
class food
{
    public void s1(String typeoffood,String name,float rating)
    {
        System.out.println(typeoffood+" "+name+" "+rating);
    }
}
class f1 extends food
{
    public void s2(String name,int price,String quantity){
        System.out.println(name+" "+price+" "+quantity);
    }
}
class f2 extends food {
    public void s3(String name, int price, String quantity) {
        System.out.println(name + " " + price + " " + quantity);
    }
}
public class inhertance_heiracal {
    public static void main(String[] args) {
        f2 obj=new f2();
        f1 obj1=new f1();
        obj.s3("briyani",1800,"8person");
        obj1.s2("porrata",240,"5person");
        obj1.s1("vegtarian","masala dosa",4.8f);
    }
}

