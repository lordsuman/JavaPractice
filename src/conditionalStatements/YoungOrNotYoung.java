package conditionalStatements;
import java.util.*;
public class YoungOrNotYoung 
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your age");
		int x= sc.nextInt();
		if(x>=17 && x<=59) 
		{
			System.out.println("Person is young");
		}
		else 
		{
		System.out.println("Person is not young");
		}
	}
}
