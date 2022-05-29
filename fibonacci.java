import java.util.Scanner;
class x
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner (System.in);
        int n,i,s1=0,s2=1,s;
        n=sc.nextInt();
        System.out.print("0 1 ");
        for(i=1;i<=n-2;i++)
        {
            s=s1+s2;
            s1=s2;
            s2=s;
            System.out.print(s+" ");
        }
    }
}