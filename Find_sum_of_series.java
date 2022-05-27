import java.util.Scanner;
class a
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		double n,i,s=0;
		n=sc.nextDouble();
		for(i=1;i<=n;i++)
		{
		    s=s+(1/i);
		}
		System.out.printf("%.2f",s);
	}
}