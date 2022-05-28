import java.util.Scanner;
class ele
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,x,a[],i,j,c;
        n=sc.nextInt();
        a= new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(x=a[0];x>0;x--)
        {
            c=0;
            for(i=0;i<n;i++)
            {
                if(a[i]%x==0)
                {
                    c++;
                }
            }
            if(c==n)
            {
                System.out.print(x);
                break;
            }
        }
    }
}