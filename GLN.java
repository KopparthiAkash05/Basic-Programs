import java.util.*;
class GLN{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int a=n,b=m;
        while(b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }
        int gcd=a;
        int lcm=(n*m)/gcd;
        System.out.print(gcd+" "+lcm);
    }
}