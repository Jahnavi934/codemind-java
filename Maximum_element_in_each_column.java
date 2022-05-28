import java.util.Scanner;
class ele
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,m,a[][],i,j,max;
        n=sc.nextInt();
        m=sc.nextInt();
        a= new int[n][m];
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<n;i++)
        {
            max=0;
            for(j=0;j<n;j++)
            {
                max=a[j][i]>max?a[j][i]:max;
            }
            System.out.println(max);
        }
    }
}