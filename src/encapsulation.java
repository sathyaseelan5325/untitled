/// read only using get
/*class person
{
   private String name="sathya";
   private int age=23;
   public String getName()
   {
       return name;
   }
   public int getAge()
   {
       return age;
   }
}

public class encapsulation {
    public static void main(String[] args) {
        person obj=new person();
        System.out.println("name="+obj.getName());
        System.out.println("age="+obj.getAge());
    }
}
*/
/// write only using set

/*
class person
{
    private String name="sathya";
    private int age=23;
    public void setName(String name1)
    {
        name=name1;
    }
    public void setAge(int age1)
    {
        age=age1;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }

}

public class encapsulation {
    public static void main(String[] args) {
        person obj=new person();
        obj.setName("sathyaseelan");
        obj.setAge(33);
        System.out.println("name="+obj.getName());
        System.out.println("age="+obj.getAge());
    }
}
*/

class person
{
    private String name="sathya";
    private String branch="b.sc cs";
    private int rollno=991801802;
    private String address="kare";
    private int age=18;

    public void setName(String name1)
    {
        name=name1;
    }
    public void setBranch(String branch1)
    {
        branch=branch1;
    }
    public void setRollno(int rollno1)
    {
        rollno=rollno1;
    }
    public void setAddress(String address1)
    {
        address=address1;
    }
    public void setAge(int age1)
    {
        age=age1;
    }
    public String getName()
    {
        return name;
    }
    public String setBranch()
    {
        return branch;
    }
    public int getRollno()
    {
        return rollno;
    }
    public String getAddress()
    {
        return address;
    }
    public int getAge()
    {
        return age;
    }

}

public class encapsulation {
    public static void main(String[] args) {
        person obj=new person();
        obj.setName("sathyaseelan");
        obj.setBranch("MCA");
        obj.setRollno(992111603);
        obj.setAddress("Krishnankoil");
        obj.setAge(21);

        System.out.println("name="+obj.getName());
        System.out.println("branch="+obj.setBranch());
        System.out.println("Rollno="+obj.getRollno());
        System.out.println("Address="+obj.getAddress());
        System.out.println("age="+obj.getAge());
    }
}
