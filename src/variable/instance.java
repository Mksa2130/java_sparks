package variable;



public class instance {

    //I'll make instance variable
    String name="Nazia";
    int age=23;           // premitive variable
    static String course="Java";
public static void main(String[] args)

{
instance i=new instance(); //non premitive variable ->refrence variable this is also called object class
    System.out.println("name "+ i.name);
    System.out.println("Age is "+ i.age);
    System.out.println("course "+ i.course);

    i.name= "Mrityunjay";
    i.course="DSA";

    System.out.println("name "+ i.name);
    System.out.println("course "+ i.course);

    System.out.println("----------------------------------");

    instance i1 =new instance(); //non premitive variable ->refrence variable this is also called object class
    System.out.println("name "+ i1.name);
    System.out.println("Age is "+ i1.age);
    System.out.println("course "+ i1.course);
    i1.name="Himadri";
    i.display();

 }
 public void display()
 {
     String name ="Salman";
     System.out.println("name " +name);

 }


}
