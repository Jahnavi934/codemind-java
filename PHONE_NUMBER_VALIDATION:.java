import java.util.Scanner;
class x
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner (System.in);
        String num;
        int n;
        num=sc.next();
        char[] c=num.toCharArray();
        if(10==num.length()&& c[0]!=0)
        {
            System.out.print("Valid");
        }
        else
        {
            System.out.print("Invalid");
        }
    }
}