import java.util.*;
class DON{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int mid=n/2;
        for(int i=0;i<n;i++)
        {
            int spaces=Math.abs(mid-i);
            int stars=n-2*spaces;
            for(int j=0;j<spaces;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<stars;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}