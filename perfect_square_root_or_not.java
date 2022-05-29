import java.util.Scanner;
class x
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner (System.in);
        int n,r;
        n=sc.nextInt();
        r=(int)Math.sqrt(n);
        if(r*r==n)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}