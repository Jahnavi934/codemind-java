import java.util.Scanner;
class x
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner (System.in);
        int a,b,i;
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=a;i>0;i--)
        {
            if(a%i==0 && b%i==0)
            {
                System.out.print(i);
                break;
            }
        }
    }
}