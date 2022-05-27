import java.util.Scanner;
class c
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        a=a-1;
        b=(a*(a+1))/2;
        System.out.print(b);
    }
}