import java.util.Scanner;
class temp
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        double f,c;
        c=sc.nextInt();
        f=32+(c*9/5);
        System.out.printf("%.2f",f);
    }
}