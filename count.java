import java.util.*;
class count{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int c=0;
        while(n!=0)
        {
           int num=n%10;
            n=n/10;
            c=c+1;
        }
        System.out.print(c);
    }
}