import java.util.Scanner;
class ele
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,a[],d,i,c=0;
        n=sc.nextInt();
        a= new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            d=(int)Math.log10(a[i])+1;
            if(d%2==0)
            {
                c++;
            }
        }
        System.out.print(c);
    }
}