import java.util.Scanner;
class a
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int a,r;
		a=sc.nextInt();
		r=(int)Math.sqrt(a);
		if(r*r==a)
		{
		    System.out.print("True");
		}
		else
		{
		    System.out.print("False");
		}
	}
}