package switchcaselecture;
import java.util.*;
public class MenuDrivenCalculator {
	public static void main (String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Menu:	ADD	SUB	DIV	MUL");
		System.out.println("=====================");
		System.out.println("Enter two numbers");
		int x=sc.nextInt();
		int y=sc.nextInt();
		sc.nextLine();
		System.out.println("Choose one option from menu and write in words");
		String menu= sc.nextLine();
				
		switch(menu)
		{
		case "ADD": System.out.println("Sum is " + (x+y));
			break;
		case "SUB": System.out.println("Sub is " + (x-y));
		break;
		case "MUL": System.out.println("Mul is " + (x*y));
		break;
		case "DIV": System.out.println("Div is " + (x/y));
		break;
		default : System.out.println("Not in option");
		break;
		}
	}

}
