import java.util.*;
class reverse{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int result=rev(num);
        System.out.println(result);
    }
    static int rev(int n){
        int revn=0;
        while(n!=0){
            int m=n%10;
            revn=revn*10+m;
            n=n/10;
        }
        return revn;
    }
}