import java.util.Scanner;
class temp
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        double a,b,c,s,r;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        s=(a+b+c)/2;
        r=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("%.2f",r);
    }
}
