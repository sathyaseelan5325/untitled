/*class animal  /// grandfather
{
    public void d1(String color,String typeoffood)
    {
        System.out.println(color+" "+typeoffood);
    }
}
class dog extends animal  /// father
{
    public void d2(String name,String bread,String color)
    {
        System.out.println(name+" "+bread+" "+color);
    }
}
class puppy extends dog  ///child
{
    public void d3(String name,String bread,String color,String gender)
    {
        System.out.println(name+" "+bread+" "+color+" "+gender);
    }
}

public class inhertance_multiple {
    public static void main(String[] args) {
        puppy obj=new puppy();
        obj.d1("black","meat");
        obj.d2("spike","husky","grey");
        obj.d3("charlie","husky","grey","male");
    }
}
*/