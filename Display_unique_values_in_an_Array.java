import java.util.Scanner;
class ele
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,a[],f,i,j,r=0;
        n=sc.nextInt();
        a= new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            f=0;
            for(j=0;j<n;j++)
            {
                if(i==j)
                continue;
                if(a[i]==a[j])
                {
                    f=1;
                }
            }
            if(f==0)
            {
                System.out.print(a[i]+" ");
                r=1;
            }
        }
        if(r==0)
        System.out.print("-1");
    }
}