import java.util.*;
class PNS{
    public static void main(String args[])
    {
        int num;
        Scanner s=new Scanner(System.in);
        num=s.nextInt();
        if(num==0)
        {
            System.out.println("Zero");
        }
        else if(num>0)
        {
            System.out.println("Positive");
        }
        else
        {
            System.out.println("Negative");
        }
    }
}