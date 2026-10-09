package switchcaselecture;

import java.util.Scanner;

public class TypeOfWebsiteUsingSwitch {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the URL");
		String url= sc.nextLine();
		String protocol= url.substring(0, url.indexOf(":"));
		switch(protocol)
		{
		case "https": System.out.println("HYPER TEXT TRANSFER PROTOCOL SECURED");
		break;
		case "http" : System.out.println("HYPER TEXT TRANSFER PROTOCOL");
		break;
		case "ftp" : System.out.println("FILE TRANSFER PROTOCOL");
		break;
		default : System.out.println("Not in database");
		break;
		}
		
	}
}
