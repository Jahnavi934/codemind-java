import java.util.Scanner;
class x
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner (System.in);
        int n,i,s1=0,s2=1,s=0;
        n=sc.nextInt();
        while(s<n)
        {
            s=s1+s2;
            s1=s2;
            s2=s;
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