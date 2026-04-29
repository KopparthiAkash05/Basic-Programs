import java.util.*;
class ASCII{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        char str=s.next().charAt(0);
        int ascii=str;
        System.out.println("ASCII value of "+str+" is "+ascii);
    }
}