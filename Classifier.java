import java.util.*;
class Classifier{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        char str=s.next().charAt(0);
        if(str>='0' && str<='9')
        {
            System.out.println("Digit");
        }
        else if((str>='A' && str<='Z')||(str>='a' && str<='z'))
        {
            System.out.println("Alphabet");
        }
        else
        {
            System.out.println("Special Characters");
        }
    }
}