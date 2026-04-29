import java.util.*;
class fact{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int res=factorial(num);
        System.out.println(res);
    }
    public static int factorial(int n)
    {
        if(n==1||n==0)
          return 1;
        return n*factorial(n-1);
    }
    
}