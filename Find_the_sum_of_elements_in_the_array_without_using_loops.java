import java.util.Scanner;
class a
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int n,i,s=0,a[];
		n=sc.nextInt();
		a=new int[n];
		for(i=0;i<n;i++)
		{
		    a[i]=sc.nextInt();
		    s=s+a[i];
		}
		System.out.println(s);
	}
}