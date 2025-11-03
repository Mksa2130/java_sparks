public class IfElseDemo {
    public static void main(String[] args)
    {
        int a=1;
        System.out.println("babu 10rs hai  kya");
        if (a>10)
        {
            System.out.println("ha le chal tu khush rah");
            a=a-10;
            System.out.println("babu 9rs de do..");
            if(a>8)
            {
                System.out.println("babu 9rs paytem karta hu");
              a=a-9;
            }
            else
            {
             System.out.println("sorry babu");
             System.out.println("chal koi baat nhi 5 wali kitkat dila do");
             if(a>5)
             {
                 System.out.println("kitkat lelo");
             }
             else
             {
                 System.out.println("koi bat nhi babu mai paise de deti hu");
             }
            }
        }
        else if(a>5)
        {
            System.out.println("bhai 10 nhi hai mere pass");
            System.out.println("chal 5 hi de de");
            if(a>5)
            {
                System.out.println("chal bhai tu 5 lele");
            }
            else
            {
                System.out.println("bhai 5 nhi hai ");
            }
        }
        else{
            System.out.println("paise hi nhi hai");
        }
    }
}
