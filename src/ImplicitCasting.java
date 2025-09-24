public class ImplicitCasting {
    public static void main(String[] args)
    {
        int a =100; //int->long
        short s=12;
        int c=s;
        System.out.println(s);
            }
}
class ExplicitCasting {
    public static void main(String[] args) {
        long l = 734687236L;
        int a = (int)l;
        System.out.println(a);
        double d=77.23;

        int i=(int) d;
        System.out.println(i);
    }
}
