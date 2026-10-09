package conditionalStatements;

public class Relational 
{
	public static void main(String args[])
	{
		int a=3, b=7, c=9;
		System.out.println(a>b && b>c);
		System.out.println(a>b && c>b);
		System.out.println(c>b || a>b);
	}
	

}
