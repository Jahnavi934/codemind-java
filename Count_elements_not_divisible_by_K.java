import java.util.Scanner;
class ele
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,a[],k,i,c=0;
        n=sc.nextInt();
        a= new int[n];
        k=sc.nextInt();
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(a[i]%k!=0)
            {
                c++;
            }
        }
        System.out.println(c);
    }
}