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
            a[i]=a[i]*a[i];
        }
        for(i=0;i<n-1;i++)
        {
            for(j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int t;
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
        }
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}