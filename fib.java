import java.util.*;
class fib{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        fibs(num);
    }
    static void fibs(int n)
    {
        int a=0,b=1;
        for(int i=1;i<=n;i++)
        {
            System.out.print(a+" ");
            int next=a+b;
            a=b;
            b=next;
        }
    }
}