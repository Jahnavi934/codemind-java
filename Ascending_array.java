import java.util.Scanner;
class ass
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int n,x[],i,a=0;
		n=sc.nextInt();
		x=new int[n];
		for(i=0;i<n;i++)
		{
			x[i]=sc.nextInt();
		}
		for(i=0;i<n-1;i++)
		{
			if(x[i]<x[i+1])
			{
			    a++;
			}
		}
		if(a==n-1)
		System.out.print("yes");
		else
		System.out.print("no");
	}
}