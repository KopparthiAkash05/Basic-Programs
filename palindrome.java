import java.util.*;
class palindrome{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        palin(num);
    }
    static void palin(int n){
        int rev=0;
        int org=n;
        while(n!=0){
            int dig=n%10;
            rev=rev*10+dig;
            n=n/10;
        }
        if(rev==org)
        {
            System.out.println("It is palindrome");
        }
        else
        {
            System.out.println("It is not palindrome");
        }
        
    }
}