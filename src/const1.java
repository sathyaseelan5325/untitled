/*class abc
{
    abc()
    {
        System.out.println("welcome");
    }
}
public class const1 {
    public static void main(String[] args) {
        abc obj=new abc();
    }
}
*/

///default constructor
/*demo obj1 = new demo();
            obj1.emp("sathya", 235689, 50000, "full stack");
            obj1.dep("TATA STRIVE", 2298785, 450, 991801821);*/

/// parameter constructor
/*class abc
{
 abc(int a,int b)
 {
     System.out.println(a+b);
     System.out.println(a*b);
     System.out.println(a-b);
     System.out.println(a/b);
 }
}
public class const1 {
    public static void main(String[] args) {
        abc obj=new abc(6,3);
    }
}*/

/*class qwe
{
    qwe(String name,int age)
    {
    System.out.println(name+" "+age);
    }
    public void s2(String name, int age, String branch) {
        System.out.println(name+" "+age+" "+branch);

    }
}
public class const1 {
    public static void main(String[] args) {
        qwe obj=new qwe("sathya",23);
        obj.s2("kishore",22,"cs");

    }
}*/

/*class lorry
{
    lorry(String fueltype,int capacity)
    {
        System.out.println(fueltype+" "+capacity);
    }
    lorry(String name,int price,String tyresize)
    {
        System.out.println(name+" "+price+" "+tyresize);
    }
    public void car(String name,String color,int price) {
        System.out.println(name+" "+color+" "+price);
    }
    public void bike(String name,String color) {
        System.out.println(name+" "+color);
    }
}
public class const1 {
    public static void main(String[] args) {
        lorry obj2=new lorry("petrol",1500);
        lorry obj=new lorry("TATA",200000,"R6");
        obj.car("kia","red",300000);
        obj.bike("honda","black");
    }
}*/
class e1
{
e1(String name,String role,int salary,String gender)
{
    System.out.println(name+" "+role+" "+salary+" "+gender);
}
e1(String name,int age,String location,int experience)
{
    System.out.println(name+" "+age+" "+location+" "+experience);
}
public void h1(String name,int id,String companyname) {
    System.out.println(name+" "+id+" "+companyname);
}
public void d1(int depid,String depname,String location) {
    System.out.println(depid+" "+depname+" "+location);
}
}
public class const1 {
    public static void main(String[] args) {
        e1 obj2=new e1("ram","java",50000,"male");
        e1 obj=new e1("sathya",23,"pmk",5);
        obj.h1("kishore",234568,"TATA Strive");
        obj.d1(965432,"Data analyst","banglore");
    }
}
