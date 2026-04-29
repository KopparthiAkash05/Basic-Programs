import java.util.*;
class Leap{
    public static void main(String args[])
    {
        int num;
        Scanner s=new Scanner(System.in);
        num=s.nextInt();
        String res=(num%4==0) ?"Leap year":"Not leap year";
        System.out.println(res); 
    }
}