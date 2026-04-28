import java.util.*;
class Calculation{
    public static void main(String args[])
    {
        int a,b,sum,diff,pro,quo;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        sum=a+b;
        diff=a-b;
        pro=a*b;
        quo=a/b;
        System.out.println("Sum: "+sum);
        System.out.println("Difference: "+diff);
        System.out.println("Product: "+pro);
        System.out.println("Quotient: "+quo);
    }
}