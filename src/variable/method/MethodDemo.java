package variable.method;

import java.math.BigInteger;

public class MethodDemo {
    public static void main(String[] args)
    {
        System.out.println("Hii java");
        MethodDemo m1=new MethodDemo();
        MethodDemo m2=new MethodDemo();
        m1.greet();//method calling
        m1.displayname("Mrityunjay","m1");// method calling
       String res=m1.otpgen();
       System.out.println(res);
       System.out.println(m2.otpgen());

       int sumVAle=m1.sum(10,123);
       System.out.println(sumVAle);
    }
    //method//type-1 no parameter , no return
    public void greet()
    {
        System.out.println("Good Morning Java");
    }


    //type-2 with parameter , no return

    public void displayname(String name,String method)
    {
        System.out.println("hello "+name +"-"+method);
    }


    //type-3 no parameter, returns
    public String otpgen( )
    {
        return "84653";
    }

    //type-4 with parameter and return
    public int sum(int a, int b)
    {
        return a+b;
    }


}
