import java.util.Scanner;
class LCM
{
    public static void main(String args[])
    {
        int a,b,max;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        if(a>b)
        {
            max=a;
        }
        else
        {
            max=b;
        }
        for(;;max++)
        {
            if(max%a==0&&max%b==0)
            {
                System.out.println(max);
                break;
            }
        }
    }
}