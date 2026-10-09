package operators;

public class IncreDecreOp {

	public static void main(String[] args) 
	{
		int a=5, b=7;
		int c= 2*a++ + 3*++b;
		int d= 2*a++ + 3*++a;
		int e= 2*a-- + 3*--b;    // 16 + 21 = 37
		int f= 2*b-- + 3*--b;		// 14+ 15= 29
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
	}

}
