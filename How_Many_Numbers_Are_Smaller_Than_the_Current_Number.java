import java.util.Scanner;
class ele
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,a[],i,j,c=0;
        n=sc.nextInt();
        a= new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            c=0;
            for(j=0;j<n;j++)
            {
                if(i==j)
                continue;
                if(a[j]<a[i])
                {
                    c++;
                }
            }
            System.out.print(c+" ");
        }
    }
}