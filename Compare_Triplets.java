import java.util.Scanner;
class ele
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,a[],b[],i,x=0,y=0;
        n=3;
        a= new int[n];
        b= new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            b[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(a[i]>b[i])
            {
                x++;
            }
            else if(a[i]<b[i])
            {
                y++;
            }
            else
            {
                
            }
        }
        System.out.print(x+" "+y);
    }
}