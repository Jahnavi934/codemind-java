import java.util.Scanner;
class x
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner (System.in);
        int n,n1,n2,k,c=0;
        n1=sc.nextInt();
        n2=sc.nextInt();
        k=sc.nextInt();
        for(n=n1;n<=n2;n++)
        {
            if(n%k==0)
            c++;
        }
        System.out.print(c);
    }
}