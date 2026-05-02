import java.util.*;
class separation{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String st=s.nextLine();
        String str=st.toLowerCase();
        int c1=0,c2=0,c3=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z')
            {
                c1=c1+1;
            }
            else if(ch>='0' && ch<='9')
            {
                c2=c2+1;
            }
            else
            {
                c3=c3+1;
            }
        }
        System.out.println("Alphabets:"+c1);
        System.out.println("Digits:"+c2);
        System.out.println("Special Characters:"+c3);
        
    }
}