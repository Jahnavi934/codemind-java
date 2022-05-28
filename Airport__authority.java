import java.util.Scanner;
class ele
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,a[],t,i,c=0;
        n=sc.nextInt();
        a= new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        t=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]<=t)
            c++;
            else
            c=c+2;
        }
        System.out.print(c);
    }
}