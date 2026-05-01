import java.util.*;
import java.lang.*;
class armstrong{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int c=0;
        int sum=0;
        int org=n;
        int temp=n;
        while(temp!=0)
        {
            c+=1;
            temp=temp/10;
        }
        while(n!=0)
        {
            int m=n%10;
            sum+=Math.pow(m,c);
            n=n/10;
        }
        if(sum==org)
        {
            System.out.println("It is armstrong number");
        }
        else
        {
            System.out.println("It is not armstrong number");
        }
        
    }
}