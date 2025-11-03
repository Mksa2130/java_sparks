package Switch;

import java.util.Scanner;
public class switch_class {
    public static void main (String[] args)
    {
//        int n=2;
        Scanner sc = new Scanner(System.in);  //object
        int n =sc.nextInt();
        switch(n){
            case 1:
                System.out.println("value is 1");
                break;
            case 2:
                System.out.println("value is 2");
                break;
            case 3:
                System.out.println("value is 3");
                break;
            default:
                System.out.println("not exist");
        }
    }
}
