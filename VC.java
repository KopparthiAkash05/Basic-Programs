import java.util.*;
import java.lang.*;
class VC{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        char str1=s.next().charAt(0);
        char str=Character.toLowerCase(str1);
        if(str=='a'||str=='e'||str=='i'||str=='o'||str=='u'){
            System.out.println("vowel");
        }
        else
        {
            System.out.println("consonent");
        }
    }
}