package operators;
import java.util.*;
public class QuadraticEquation 
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println( "Enter the three values for a quadratic equation ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		 double r1= (-b+ Math.sqrt(b*b-4*a*c))/2*a;
		 double r2= (-b- Math.sqrt(b*b-4*a*c))/2*a;
		 System.out.println(" The two roots are " + r1 + " and " + r2);
			 
		 }
}
