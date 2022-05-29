import java.util.Scanner;
class x
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner (System.in);
        int n,r,i,a[];
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            n=a[i];
            r=(int)Math.sqrt(n);
            if(r*r==n)
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
        }
    }
}