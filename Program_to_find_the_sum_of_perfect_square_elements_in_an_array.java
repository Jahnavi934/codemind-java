import java.util.Scanner;
class spse
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n,a[],i,r,s=0;
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            
            r=(int)Math.sqrt(a[i]);
            if(r*r==a[i])
            {
                s=s+a[i];
            }
        }
        System.out.print(s);
    }
}