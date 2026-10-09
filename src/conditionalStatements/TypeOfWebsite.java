package conditionalStatements;
import java.util.*;
public class TypeOfWebsite 
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the URL");
		String url= sc.nextLine();
		
		String protocol= url.substring(0, url.indexOf(":"));
		if (protocol.equals("http"))
		{
			System.out.println("Hyper Text Transfer Protocol");
		}
		else if (protocol.equals("ftp"))
		{
			System.out.println("File Transfer Protocol");
		}
		else if (protocol.equals("https"))
		{
			System.out.println("Hyper Text Transfer Protocol Secured");
		}
		else
		{
			System.out.println("Not in database");
			System.out.println("Not in database");
		}
	}
}
