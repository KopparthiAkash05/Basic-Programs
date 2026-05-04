import java.util.*;
class rectangle{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int r=s.nextInt();
        int c=s.nextInt();
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=c;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}