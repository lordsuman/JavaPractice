package operators;
import java.util.*;

public class AreaOfTriangle {
	public static void main (String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the three sides of a triangle");
		double a = sc.nextInt();
		double b = sc.nextInt();
		double c = sc.nextInt();
		double s = 0.5*(a+b+c);
		double area= Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area of required triangle is " + area);
	}

}
