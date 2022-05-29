import java.util.Scanner;
class x
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner (System.in);
        int n,i,m=0,r;
        n=sc.nextInt();
        while(n>0)
        {
            r=n%10;
            m=r>m?r:m;
            n=n/10;
        }
        System.out.print(m);
    }
}