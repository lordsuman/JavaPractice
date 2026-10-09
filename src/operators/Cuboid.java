package operators;
import java.util.*;

public class Cuboid {
	public static void main(String args[])
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the length, breadth and height of a cuboid");
		int l= sc.nextInt();
		int b= sc.nextInt();
		int h= sc.nextInt();
		int area= 2* ((l*b)+(b*h)+(h*l));
		int perimeter= 4*(l+b+h);
		int volume= l*b*h;
		System.out.println("Perimeter = " + perimeter + " Area = "+ area + " Volume = " + volume);
	}

}
