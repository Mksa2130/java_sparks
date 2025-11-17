package variable;

public class instance {

    //instance variable
    String name="Nazia";
    int age=23;           // premitive variable
public static void main(String[] args)

{
instance i=new instance(); //non premitive variable ->refrence variable this is also called object
    System.out.println("name "+ i.name);
    System.out.println("Age is "+ i.age);

}

}
