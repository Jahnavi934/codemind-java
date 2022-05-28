import java.util.Scanner;
class ele
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,a[],b[],i,s=0;
        n=sc.nextInt();
        a= new int[n];
        b= new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            b[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            s=a[i]+b[i];
            System.out.print(s+" ");
        }
    }
}