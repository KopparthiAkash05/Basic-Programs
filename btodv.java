import java.util.*;
class btodv{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int b=s.nextInt();
        int d=0;
        int base=1;
        while(b>0)
        {
            int dig=b%10;
            d=d+dig*base;
            base=base*2;
            b=b/10;
        }
        int dec=s.nextInt();
        int bin=0;
        int bas=1;
        while(dec>0)
        {
            int dig2=dec%2;
            bin=bin+dig2*bas;
            bas=bas*10;
            dec=dec/2;
        }
        System.out.println("Decimal:"+d);
        System.out.print("Binary:"+bin);
    }
}