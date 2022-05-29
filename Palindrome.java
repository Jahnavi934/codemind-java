import java.util.Scanner;
class pal
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,r,s=0,d;
        n=sc.nextInt();
        d=n;
        while(d>0)
        {
            r=d%10;
            s=s*10+r;
            d=d/10;
        }
        if(s==n)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}