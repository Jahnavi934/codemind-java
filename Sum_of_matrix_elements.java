import java.util.Scanner;
class ele
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,m,a[][],i,j,s=0;
        n=sc.nextInt();
        m=sc.nextInt();
        a= new int[n][m];
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                a[i][j]=sc.nextInt();
                s=s+a[i][j];
            }
        }
        System.out.print(s);
    }
}