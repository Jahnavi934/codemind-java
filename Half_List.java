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
        for(i=0;i<n/2;i++)
        {
            j=n-1-i;
            System.out.print(a[j]+" ");
        }
        for(i=0;i<n/2;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}