package conditionalStatements;

public class WhichIsGreaterInThreeNumbers 
{
	public static void main(String args[])
	{
		int a=3, b=5, c=8;
		if(a>b&&a>c)
		{
			System.out.println(a);
		}
		else
			if(b>c)
			{
				System.out.println(b);
			}
			else {
				System.out.println(c);
			}
	}

}
