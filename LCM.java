import java.util.Scanner;
class x
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner (System.in);
        int a,b,i;
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=b;;i++)
        {
            if(i%a==0 && i%b==0)
            {
            System.out.println(i);
            break;
            }
        }
    }
}