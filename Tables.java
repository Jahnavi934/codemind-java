import java.util.Scanner;
class x
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner (System.in);
        int n,i,r;
        n=sc.nextInt();
        r=sc.nextInt();
        for(i=1;i<=r;i=i+2)
        {
            System.out.println(n+" x "+i+" = "+(n*i));
        }
    }
}