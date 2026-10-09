package stringlecture;

public class printingLecture {

	public static void main(String[] args) {
		int a= 10;
		System.out.printf("%5d", a); //width
		
		System.out.printf("%05d", a); //flag
		
		int b=-11;
		float c= 123.45f;
		System.out.printf("%(5d", b);  // for negative number, it shows bracket
		System.out.printf("%+5d", b);  // + shows sign of a number
		System.out.printf("%+5f", c);
		System.out.printf("%2.2f", c);
	//Think of %2.2f as:
	//Reserve at least 2 spaces, and show the number with 2 decimal places."
	//It does not mean:
	//Show only 2 digits in total."
	//That's why you're seeing more digits than expected.
		
	}

}
