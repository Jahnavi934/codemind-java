import java.util.Scanner;
class x
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner (System.in);
        int n,i,a[][];
        n=sc.nextInt();
        a=new int[n][2];
        for(i=0;i<n;i++)
        {
            a[i][0]=sc.nextInt();
            a[i][1]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            System.out.println(a[i][0]+a[i][1]);
        }
    }
}