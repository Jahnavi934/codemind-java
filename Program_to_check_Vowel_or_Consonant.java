import java.util.Scanner;
class vowel
{
	public static void main(String[] args)
	{
		char ch;
		Scanner sc=new Scanner(System.in);
		ch=sc.next().charAt(0);
		if(ch=='A' || ch=='E' ||ch=='I' ||ch=='O' ||ch=='U'||ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u')
		{
			System.out.println("Vowel");
		}
		else
		{
			System.out.println("Consonant");
		}
	}
}